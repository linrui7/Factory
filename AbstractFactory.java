package com.github7;
/*
   Author:linrui
   Date:2019/8/3
   Content:
   抽象工厂模式
   为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
*/

//工厂生产多种类型的产品，相同类型的产品又有不同的特点

interface Iproductor1 {
    void product();
}

interface Iproductor2 {
    void product();
}

interface IFactory {
    Iproductor1 createthis1();

    Iproductor2 createthis2();
}

class Duct1 implements Iproductor1 {
    @Override
    public void product() {
        System.out.println("产品1");
    }
}

class Duct2 implements Iproductor2 {
    @Override
    public void product() {
        System.out.println("产品2");
    }
}

class AllFactory implements IFactory {

    @Override
    public Iproductor1 createthis1() {
        return new Duct1();
    }

    @Override
    public Iproductor2 createthis2() {
        return new Duct2();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        AllFactory allFactory = new AllFactory();
        allFactory.createthis1().product();
    }
}
