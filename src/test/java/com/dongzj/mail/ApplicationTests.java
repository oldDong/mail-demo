package com.dongzj.mail;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Before
    public void before() {
        System.out.println("开始测试----------------");
    }

    @After
    public void after() {
        System.out.println("结束测试----------------");
    }

}
