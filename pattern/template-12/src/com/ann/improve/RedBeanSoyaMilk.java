package com.ann.improve;

/**
 * @author longquan
 *
 * 红豆豆浆
 *
 *  实现了抽象类中的抽象方法，完成算法中特定子类的相关步骤
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入红豆....");
    }
}
