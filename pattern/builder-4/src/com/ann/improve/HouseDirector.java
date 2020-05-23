package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/23 2:10 下午
 *
 * 指挥者---动态指定制作流程，返回具体产品
 */
public class HouseDirector {

    //  聚合
    HouseBuilder houseBuilder = null;

    //  使用构造器聚合
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //  如何处理建造房子的流程，交给HouseDirector指挥者
    public House constructHouse(){
        houseBuilder.builderBasic();
        houseBuilder.builderWall();
        houseBuilder.roofed();
        return houseBuilder.builderHouse();
    }
}
