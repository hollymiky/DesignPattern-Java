package com.ann.factoryMethod2.order;

import com.ann.factoryMethod2.pizza.ACheesePizza;
import com.ann.factoryMethod2.pizza.AGreekPizza;
import com.ann.factoryMethod2.pizza.Pizza;

/**
 * @author longquan
 * @date 2020/5/21 5:14 下午
 *
 * A店---订购披萨
 */
public class AOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new ACheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new AGreekPizza();
        }
        return pizza;
    }
}
