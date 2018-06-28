package com.zim.test.sofa.sofaboottest;

import com.alipay.sofa.ark.springboot.runner.ArkBootRunner;
import com.zim.test.sofa.sofaboottest.bean.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(ArkBootRunner.class)
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = SofaBootTestApplication.class)
public class SofaBootTestApplicationTests {

    @Autowired
    private PersonService personReferenceBolt;

    @Autowired
    private PersonService personReferenceRest;

    @Test
    public void contextLoads() {
        System.out.println(personReferenceBolt.sayName("abc"));
        System.out.println(personReferenceRest.sayName("123"));
    }

}
