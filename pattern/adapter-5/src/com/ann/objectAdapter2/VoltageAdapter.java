package com.ann.objectAdapter2;

/**
 * @author longquan
 */
public class VoltageAdapter implements IVoltage5V {

    //  关联关系-聚合
    private Voltage220V voltage220V;


    //  通过构造器获取 Voltage220V 的实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            //  获取220V电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器进行适配...");
            dst = src / 44;
            System.out.println("适配ok...，输出的电压= " + dst);
        }
        return dst;
    }
}
