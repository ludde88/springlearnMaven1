package com.lijingtao.springlean;
public class Person {

    private String name;
    private int age;
    private Foot foot;

    /*public Person(String name, int age, Foot foot) {
        super();
        this.name = name;
        this.age = age;
        this.foot = foot;
    }*/

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public String toString() {
        return this.getName()+this.getAge()+this.getFoot();
    }*/


}
