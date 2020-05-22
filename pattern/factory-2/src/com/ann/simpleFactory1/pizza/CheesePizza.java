package com.ann.simpleFactory1.pizza;

/**
 * @author longquan
 * @date 2020/5/21 3:13 下午
 *
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料...");
    }
}
