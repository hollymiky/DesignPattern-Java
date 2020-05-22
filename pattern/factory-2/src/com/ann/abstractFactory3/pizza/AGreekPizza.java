package com.ann.abstractFactory3.pizza;

/**
 * @author longquan
 * @date 2020/5/21 3:13 下午
 *
 * A产地希腊披萨
 */
public class AGreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("A产地希腊披萨");
        System.out.println("给制作希腊披萨准备原材料...");
    }
}
