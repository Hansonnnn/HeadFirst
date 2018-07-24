package com.hanz.decorator;


/***
 * 装饰器模式
 *
 * 饮料基类
 */
public abstract class Beverage {
    String description = "Unknown description";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
