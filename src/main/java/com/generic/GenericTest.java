package com.generic;

import com.lijingtao.springlean.Person;

public class GenericTest {



    public static  <X> X createGenericClass(X x){
        return x;
    }

    public static void main(String[] args) {
        Person person = new Person();
        GenericClass testa = new GenericClass<Person,Person,Person>(person,person,person);
        System.out.println(testa.returnTinform());
        System.out.println(createGenericClass(testa));
    }
}
