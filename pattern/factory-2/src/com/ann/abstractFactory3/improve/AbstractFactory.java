package com.ann.abstractFactory3.improve;

import com.ann.abstractFactory3.pizza.Pizza;

/**
 * @author longquan
 * @date 2020/5/22 2:42 下午
 *
 * 抽象工厂模式的抽象层
 */
public interface AbstractFactory {

    /**
     * 留给下面的工厂子类去具体实现
     * @param orderType 订购类型
     * @return Pizza
     */
    public Pizza createPizza(String orderType);

}
