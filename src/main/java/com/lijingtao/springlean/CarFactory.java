package com.lijingtao.springlean;

public class CarFactory {

    public static Car createCar(String carName){
        Car car = null;
        if(carName.equals("NEW")){
            car = new NewCar();
        }else if(carName.equals("Old")){
            car = new OldCar();
        }
        return car;
    }
}
