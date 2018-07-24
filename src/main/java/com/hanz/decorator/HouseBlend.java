package com.hanz.decorator;


/**
 * 装饰器模式
 *
 *
 *饮料实现
 */
public class HouseBlend extends Beverage {


    public HouseBlend() {
        description = "HouseBlend is good!";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
