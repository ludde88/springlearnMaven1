package com.lijt.dao;

import org.springframework.stereotype.Component;

@Component(value = "person2Dao")
public class Person2Dao implements PersonDao{

    @Override
    public void getInformation() {
        System.out.println("Person2Dao");
    }
}
