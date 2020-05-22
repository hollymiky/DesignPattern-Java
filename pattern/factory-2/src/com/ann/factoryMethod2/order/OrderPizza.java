package com.ann.factoryMethod2.order;

import com.ann.factoryMethod2.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author longquan
 * @date 2020/5/21 5:03 下午
 *
 * 订购披萨
 */
public abstract class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";
        do{
            orderType = getType();
            //  抽象方法，由工厂子类去完成
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    /**
     * 定义一个抽象方法createPizza，让工厂子类自己实现
     */
    abstract Pizza createPizza(String orderType);


    //  定义一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("in pizza type is: ");
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
