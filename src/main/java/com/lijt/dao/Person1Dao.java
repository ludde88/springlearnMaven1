package com.lijt.dao;

import org.springframework.stereotype.Component;

@Component(value = "person1Dao")
public class Person1Dao implements PersonDao{

    @Override
    public void getInformation() {
        System.out.println("Person2Dao");
    }
}
