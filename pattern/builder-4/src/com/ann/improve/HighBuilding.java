package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/23 2:09 下午
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void builderBasic() {
        System.out.println("高楼大厦---打地基");
    }

    @Override
    public void builderWall() {
        System.out.println("高楼大厦---砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼大厦---封顶");
    }
}
