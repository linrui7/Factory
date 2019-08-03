package com.github7;

/*
   Author:linrui
   Date:2019/8/3
   Content:
   简单工厂模式
   工厂提供一个创建对象实例的方法，而无需关心具体实现
   创建的实例可以是接口，抽象类，具体的类
*/
interface Car {
    public String CarName();
}
 class BenChi implements Car{
     @Override
     public String CarName() {
         return "生产一辆奔驰汽车";
     }
 }
 class BMW implements Car{
     @Override
     public String CarName() {
         return "生产一辆宝马汽车";
     }
 }

public class SimplyFactory {
    //工厂生产车的方法
    public Car productCar(String carname){
        if(carname.equals("奔驰")){
            return new BenChi();
        }else if(carname.equals("宝马")){
            return new BMW();
        }else {
            return null;
        }
    }
    public static void main(String[] args) {
        SimplyFactory simplyFactory=new SimplyFactory();
        Car newcar=simplyFactory.productCar("奔驰");
        System.out.println(newcar.CarName());
    }
}
