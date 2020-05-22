package com.ann.abstractFactory3.order;

import com.ann.abstractFactory3.improve.AbstractFactory;
import com.ann.abstractFactory3.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author longquan
 * @date 2020/5/22 2:47 下午
 *
 * 订购披萨
 */
public class OrderPizza {

    public OrderPizza(AbstractFactory factory){
        setFactory(factory);
    }

    AbstractFactory factory;

    private void setFactory(AbstractFactory factory) {
        this.factory = factory;
        doOrder();
    }

    private void doOrder(){
        Pizza pizza = null;
        // 用户输入的类型
        String orderType = "";
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                System.out.println("订购完成..");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败...");
                break;
            }
        }while (true);
    }

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
