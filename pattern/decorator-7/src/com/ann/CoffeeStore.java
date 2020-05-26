package com.ann;

import com.ann.decorator.Chocolate;
import com.ann.decorator.Milk;

/**
 * @author longquan
 */
public class CoffeeStore {

    public static void main(String[] args) {
        //  使用装饰者模式，下订单。
        //  点一份美式咖啡+1份牛奶+2份巧克力
        //  首先将单品咖啡放入装饰(即先点一份美式咖啡)
        Drink order = new LongBlack();
        System.out.println(order.getDes() + "，费用1 = " + order.cost());

        System.out.println("-------------------------");

        //  加入一份牛奶
        order = new Milk(order);
        System.out.println("加入一份牛奶之后");
        System.out.println(order.getDes() + "，费用2 = " + order.cost());

        System.out.println("-------------------------");

        //  再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("再加入一份巧克力");
        System.out.println(order.getDes() + "，费用3 = " + order.cost());

        System.out.println("-------------------------");

        //  再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("再加入一份巧克力");
        System.out.println(order.getDes() + "，费用4 = " + order.cost());
    }

}
