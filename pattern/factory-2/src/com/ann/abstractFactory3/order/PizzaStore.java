package com.ann.abstractFactory3.order;

import com.ann.abstractFactory3.improve.AFactory;
import com.ann.abstractFactory3.improve.BFactory;

/**
 * @author longquan
 * @date 2020/5/22 2:53 下午
 */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new AFactory());
        new OrderPizza(new BFactory());
    }
}
