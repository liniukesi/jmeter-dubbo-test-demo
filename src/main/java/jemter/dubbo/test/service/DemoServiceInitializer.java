package jemter.dubbo.test.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kevin on 2017/7/3.
 */
public class DemoServiceInitializer {

    private static DemoServiceInitializer instance;
    private static ClassPathXmlApplicationContext context;

    private DemoServiceInitializer() {}

    public static DemoServiceInitializer getInstance() {
        if(null == instance) {
            synchronized (DemoServiceInitializer.class) {
                if(null == instance) {
                    instance = new DemoServiceInitializer();
                }
            }
        }
        return instance;
    }

    public void init() {
        context = new ClassPathXmlApplicationContext("classpath:dubbo/*.xml");
        if(null == context) {
            throw new RuntimeException("xml load fail");
        }
    }

    public <T> T getBean(String beanName, Class<T> t) {
        return context.getBean(beanName, t);
    }

}
