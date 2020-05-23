package com.ann.objectAdapter2;

/**
 * @author longquan
 *
 * 被适配者---220V电压
 */
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压= " + src + " 伏");
        return src;
    }

}
