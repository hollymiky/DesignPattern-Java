package com.ann.factoryMethod2.pizza;

/**
 * @author longquan
 * @date 2020/5/21 4:58 下午
 *
 * B产地的奶酪披萨
 */
public class BCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("B产地奶酪披萨");
        System.out.println("给制作B产地的奶酪披萨准备原材料...");
    }
}
