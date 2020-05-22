package com.ann.abstractFactory3.improve;

import com.ann.abstractFactory3.pizza.ACheesePizza;
import com.ann.abstractFactory3.pizza.AGreekPizza;
import com.ann.abstractFactory3.pizza.Pizza;

/**
 * @author longquan
 * @date 2020/5/22 2:43 下午
 *
 * A产地工厂-子类
 */
public class AFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("A产地 使用抽象工厂模式....");
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new AGreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new ACheesePizza();
        }
        return pizza;
    }
}
