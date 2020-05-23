package com.ann.objectAdapter2;


/**
 * @author longquan
 * <p>
 * 手机类
 */
public class Phone {

    //  充电
    public void charging(IVoltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("开始充电...");
        } else if (voltage5V.output5V() > 5) {
            System.out.println("无法使用该电源...电压过高");
        } else {
            System.out.println("无法使用该电源...");
        }
    }

}
