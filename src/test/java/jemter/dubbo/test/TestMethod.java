package jemter.dubbo.test;

import jemter.dubbo.test.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by kevin on 2017/7/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo/*.xml")
public class TestMethod {

    @Resource
    private DemoService demoService;

    @Test
    public void testServiceMethod() {
        this.demoService.demo();
    }

}
