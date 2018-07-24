package com.hanz.decorator;

/***
 * 装饰器模式
 *
 * 饮料实现 浓缩咖啡
 */
public class Espresso extends Beverage {


    public Espresso() {

        description = "Espresso is good!";

    }

    @Override
    public double cost() {
        return 1.99;
    }

}
