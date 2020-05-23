package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/23 2:04 下午
 *
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    //  组合一个成员属性Product 即House
    protected House house = new House();

    //  建造流程
    public abstract void builderBasic();
    public abstract void builderWall();
    public abstract void roofed();


    //  使用流程建造房子并返回
    public House builderHouse(){
        return house;
    }

}
