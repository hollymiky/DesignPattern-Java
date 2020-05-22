package com.ann.simpleFactory1.improve;

import com.ann.simpleFactory1.pizza.CheesePizza;
import com.ann.simpleFactory1.pizza.GreekPizza;
import com.ann.simpleFactory1.pizza.Pizza;

/**
 * @author longquan
 * @date 2020/5/21 3:43 下午
 *
 * 简单工厂类---优化披萨订购
 */
public class SimpleFactory {

    /**
     * 根据orderType返回对应pizza对象
     */
    public Pizza createPizza(String orderType){

        Pizza pizza = null;
        System.out.println("使用简单工厂模式...创建披萨中...");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek pizza ");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese pizza ");
        }
        return pizza;
    }

    /**
     * 简单工厂模式也叫静态工厂模式
     */
    public static Pizza createPizza2(String orderType){

        Pizza pizza = null;
        System.out.println("使用简单工厂模式2...创建披萨中...");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek pizza ");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese pizza ");
        }
        return pizza;
    }

}
