package com.ann.decorator;

import com.ann.Drink;

/**
 * @author longquan
 *
 * 具体的调料--巧克力
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        //  当前调味品的价格
        setPrice(3.0f);
    }


}
