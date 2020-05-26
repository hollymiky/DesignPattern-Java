package com.ann;


/**
 * @author longquan
 *
 * 咖啡类
 */
public class Coffee extends Drink {


    @Override
    public float cost() {
        return super.getPrice();
    }
}
