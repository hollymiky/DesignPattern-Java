package com.ann.abstractFactory3.improve;

import com.ann.abstractFactory3.pizza.BCheesePizza;
import com.ann.abstractFactory3.pizza.BGreekPizza;
import com.ann.abstractFactory3.pizza.Pizza;

/**
 * @author longquan
 * @date 2020/5/22 2:46 下午
 *
 * B产地工厂-子类
 */
public class BFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("B产地 使用抽象工厂模式....");
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new BGreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new BCheesePizza();
        }
        return pizza;
    }
}
