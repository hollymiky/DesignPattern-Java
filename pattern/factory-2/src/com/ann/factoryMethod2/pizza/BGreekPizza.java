package com.ann.factoryMethod2.pizza;

/**
 * @author longquan
 * @date 2020/5/21 4:59 下午
 *
 * B产地的希腊披萨
 */
public class BGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("B产地希腊披萨");
        System.out.println("给制作B产地的希腊披萨准备原材料...");
    }
}
