package com.hanz.decorator;


/***
 * 装饰器模式
 *
 * 装饰者，Mocha
 *
 */

public class Mocha extends CondimentDecorator {
    Beverage beverage; //用一个实例变量来表示被装饰者


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
