package com.ann.factoryMethod2.order;

import com.ann.factoryMethod2.pizza.*;

/**
 * @author longquan
 * @date 2020/5/21 5:16 下午
 */
public class BOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BCheesePizza();
        }else if(orderType.equals("greek")){
            pizza = new BGreekPizza();
        }
        return pizza;
    }
}
