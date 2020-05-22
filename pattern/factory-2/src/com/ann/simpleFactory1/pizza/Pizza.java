package com.ann.simpleFactory1.pizza;

/**
 * @author longquan
 * @date 2020/5/21 2:45 下午
 *
 * 披萨类--抽象类
 *
 * 该方式没有用到设计模式
 *
 *
 * 具体优化方案参考 com.ann.improve包中的方案【简单工厂模式】
 */
public abstract class Pizza {

    /**
     * 披萨名字
     */
    protected String name;

    /**
     * 准备做披萨的原材料，不同的披萨材料是不一样的，因此该方法定义为抽象方法
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake(){
        System.out.println(this.name + " baking.");
    }

    /**
     * 切割
     */
    public void cut(){
        System.out.println(this.name + " cutting.");
    }

    /**
     * 打包
     */
    public void box(){
        System.out.println(this.name + " boxing.");
    }

    public void setName(String name) {
        this.name = name;
    }
}

