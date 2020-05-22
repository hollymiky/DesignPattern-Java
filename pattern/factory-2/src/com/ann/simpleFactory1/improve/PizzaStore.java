package com.ann.simpleFactory1.improve;

import com.ann.simpleFactory1.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author longquan
 * @date 2020/5/21 4:22 下午
 *
 * 简单工厂---披萨商店---订购披萨
 *
 */
public class PizzaStore {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        new OrderPizza(simpleFactory);
        System.out.println("goodbye.");

        System.out.println("---------------------------");

        new OrderPizza2();
    }
}

/**
 * 订购披萨
 */
class OrderPizza {

    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory factory;

    Pizza pizza = null;

    public OrderPizza(SimpleFactory factory) {
        setFactory(factory);
    }

    public void setFactory(SimpleFactory factory) {
        this.factory = factory;
        doOrder();
    }

    /**
     * 下单
     */
    public void doOrder() {
        //  用户输入
        String orderType = "";
        do {
            orderType = getType();
            pizza = this.factory.createPizza(orderType);
            //  订购成功
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败...");
                break;
            }
        } while (true);
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

/**
 * 订购披萨2
 */
class OrderPizza2 {

    Pizza pizza = null;

    String orderType = "";

    public OrderPizza2() {
        doOrder();
    }

    /**
     * 下单
     */
    public void doOrder() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            //  订购成功
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败...");
                break;
            }
        } while (true);
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
