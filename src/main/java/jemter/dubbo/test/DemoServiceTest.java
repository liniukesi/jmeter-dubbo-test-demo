package jemter.dubbo.test;

import jemter.dubbo.test.service.DemoService;
import jemter.dubbo.test.service.DemoServiceInitializer;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import javax.annotation.Resource;

/**
 * Created by kevin on 2017/7/3.
 */
public class DemoServiceTest extends AbstractJavaSamplerClient {

    //@Resource
    private DemoService demoService;

    /**
     * 测试准备工作
     * @param javaSamplerContext
     */
    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {
        super.setupTest(javaSamplerContext);
        System.err.println("test started.");
        DemoServiceInitializer initializer = DemoServiceInitializer.getInstance();
        if (null != initializer) {
            initializer.init();
            demoService = initializer.getBean("demoService", DemoService.class);    
        }
    }

    /**
     * 执行测试的接口
     * @param javaSamplerContext
     * @return
     */
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult result = new SampleResult();
        try {
            long start = System.currentTimeMillis();
            this.demoService.demo();
            result.setSuccessful(true);
            long end = System.currentTimeMillis();
            result.setResponseData((end - start)+"", null);
        } finally {
            result.sampleEnd();
        }
        return result;
    }

    /**
     * 测试完成后的操作
     * @param context
     */
    @Override
    public void teardownTest(JavaSamplerContext context) {
        super.teardownTest(context);
        System.err.println("test finished.");
    }

}
