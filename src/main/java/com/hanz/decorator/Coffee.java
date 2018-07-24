package com.hanz.decorator;

public class Coffee {

    public static void main(String[] args) {
        /**
         * 订一杯Espresso,不要任何调料
         */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        /**
         * 订一杯HouseBlend,加Mocha & Soy
         */
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);


        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

    }
}
