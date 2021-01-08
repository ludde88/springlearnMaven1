package com.lijingtao.springlean;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGetBean {
    private String value;

    public void test(TestGetBean tt){
        String t1 = this.value;
        String t2 = tt.value;

    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassA aa = (ClassA) cp.getBean("ca",ClassA.class);

        /*Car car = (Car)cp.getBean("car");
        car.runCar();*/
        /*Car car = CarFactory.createCar("NEW");
        car.runCar();*/


        /*Person person1 = (Person)cp.getBean("person");
        Person person2 = (Person)cp.getBean("person");
        Person person3 = (Person)cp.getBean("person");

        System.out.println(person1+"   "+person1.getFoot());
        System.out.println(person2+"   "+person2.getFoot());
        System.out.println(person3+"   "+person3.getFoot());

        Foot foot1 = (Foot) cp.getBean("foot");
        Foot foot2 = (Foot) cp.getBean("foot");

        System.out.println(foot1+"   "+foot2);*/

        /*TestGetBean testGetBean = new TestGetBean();
        String tt = testGetBean.value;*/


    }
}
