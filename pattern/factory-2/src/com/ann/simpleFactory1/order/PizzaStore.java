package com.ann.simpleFactory1.order;

import com.ann.simpleFactory1.pizza.CheesePizza;
import com.ann.simpleFactory1.pizza.GreekPizza;
import com.ann.simpleFactory1.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author longquan
 * @date 2020/5/21 3:05 下午
 * <p>
 * 披萨商店类，能够发起订购披萨
 */
public class PizzaStore {

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
    }
}

/**
 * 订购披萨
 */
class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        //  订购披萨的类型
        String orderType;
        do{
            orderType = getType();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("greek pizza ");
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("cheese pizza ");
            }else{
                System.out.println("goodbye.");
                return;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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