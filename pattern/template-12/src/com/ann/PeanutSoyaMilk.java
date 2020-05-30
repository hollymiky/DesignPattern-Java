package com.ann;

/**
 * @author longquan
 *
 * 花生豆浆
 *
 *  实现了抽象类中的抽象方法，完成算法中特定子类的相关步骤
 */
public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生....");
    }
}
