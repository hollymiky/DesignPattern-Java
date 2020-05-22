package com.ann.simpleFactory1.pizza;

/**
 * @author longquan
 * @date 2020/5/21 3:13 下午
 *
 * 希腊披萨
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作希腊披萨准备原材料...");
    }
}
