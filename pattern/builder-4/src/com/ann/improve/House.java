package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/23 2:02 下午
 *
 *
 * 房子类---对应建造者模式中的 Product
 */
public class House {

    //  地基
    private String basic;

    //  墙
    private String wall;

    //  屋顶
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
