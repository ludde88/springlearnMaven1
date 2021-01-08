package com.lijt;

import com.lijingtao.springlean.ClassA;
import com.lijt.controller.SpringTestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
        public static void main(String[] args){
            ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
            SpringTestController aa = cp.getBean("maiController", SpringTestController.class);
            aa.testController1();
    }
}
