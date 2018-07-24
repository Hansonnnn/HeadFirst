package com.hanz.decorator;


/***
 * 装饰器模式
 *
 * 装饰者，soy
 */

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.29 + beverage.cost();
    }
}
