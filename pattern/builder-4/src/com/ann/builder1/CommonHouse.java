package com.ann.builder1;

/**
 * @author longquan
 * @date 2020/5/23 11:35 上午
 *
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void builderBasic() {
        System.out.println("普通房子---打地基");
    }

    @Override
    public void builderWall() {
        System.out.println("普通房子---砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子---封顶");
    }
}
