package com.ann.builder1;

/**
 * @author longquan
 * @date 2020/5/23 11:32 上午
 *
 * 盖房项目需求
 * 1. 需要建房子：这一过程为打桩、砌墙、封顶
 * 2. 房子有各种各样的，比如普通房、高楼、别墅，各种房子的过程虽然一样，但是要求不要相同的
 *
 *
 * 使用传统模式解决
 */
public abstract class AbstractHouse {
    //  打地基
    public abstract void builderBasic();
    //  砌墙
    public abstract void builderWall();
    //  封顶
    public abstract void roofed();

    public void builder(){
        builderBasic();
        builderWall();
        roofed();
    }
}
