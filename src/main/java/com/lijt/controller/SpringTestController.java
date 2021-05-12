package com.lijt.controller;

import com.lijt.dao.PersonDao;
import com.lijt.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("maiController")
public class SpringTestController {
    @Autowired
    public SpringService springService;
    //testController1
    public void testController1(){
        PersonDao personDao = springService.getPersonDao();
        System.out.println(personDao);
    }
}
