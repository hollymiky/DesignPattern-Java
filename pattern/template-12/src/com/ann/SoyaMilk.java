package com.ann;

/**
 * @author longquan
 *
 * 抽象类-豆浆
 *
 * 类中实现了模版方法，定义了算法的骨架，具体子类需要去实现其他的抽象方法
 */
public abstract class SoyaMilk {

    /**
     * 模版方法，make，模板方法可以定义成final，不让子类去覆盖
     */
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    void select(){
        System.out.println("第一步：选材....");
    }

    /**
     * 添加不同的配料
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("第三步：浸泡...");
    }

    /**
     * 打碎
     */
    void beat(){
        System.out.println("第四部：放入豆浆机中打碎...");
    }

}
