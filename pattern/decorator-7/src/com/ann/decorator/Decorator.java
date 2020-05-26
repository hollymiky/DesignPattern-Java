package com.ann.decorator;

import com.ann.Drink;

/**
 * @author longquan
 * <p>
 * 装饰者
 */
public class Decorator extends Drink {

    private Drink drink;

    //  组合
    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //  getPrice 这里拿到的是自己的价格
        //  加上单品咖啡的价格 drink.cost()
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        //  drink.getDes() 被装饰者的信息
        return des + " " + getPrice() + " && " + drink.getDes();
    }
}
