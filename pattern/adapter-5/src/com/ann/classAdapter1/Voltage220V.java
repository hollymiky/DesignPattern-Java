package com.ann.classAdapter1;

/**
 * @author longquan
 * @date 2020/5/23 4:17 下午
 * <p>
 * 被适配的类---220V电压
 */
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压= " + src + " 伏");
        return src;
    }

}
