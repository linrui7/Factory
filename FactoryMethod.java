package com.github7;
/*
   Author:linrui
   Date:2019/8/3
   Content:
   工厂方法
   需要什么类就new什么类
*/
interface Factory{
    Car productCar();
}
class BenChifactory implements Factory{
    @Override
    public Car productCar() {
        return new BMW();
    }
}
class BMWfactory implements Factory{
    @Override
    public Car productCar() {
        return new BenChi();
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
       //需要一辆宝马
        Factory newBaoMa=new BMWfactory();
        System.out.println(newBaoMa.productCar().CarName());

    }
}
