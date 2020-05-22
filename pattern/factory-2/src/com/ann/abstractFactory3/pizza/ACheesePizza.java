package com.ann.abstractFactory3.pizza;

/**
 * @author longquan
 * @date 2020/5/21 3:13 下午
 *
 * A产地奶酪披萨
 */
public class ACheesePizza extends Pizza {


    @Override
    public void prepare() {
        setName("A产地奶酪披萨");
        System.out.println("给制作A产地的奶酪披萨准备原材料...");
    }
}
