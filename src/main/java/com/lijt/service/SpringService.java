package com.lijt.service;

import com.lijt.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpringService {
    @Autowired
    @Qualifier("person2Dao")
    public PersonDao personDao;


    public PersonDao getPersonDao() {
        return personDao;
    }
}
