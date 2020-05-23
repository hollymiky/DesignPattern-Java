package com.ann.classAdapter1;

/**
 * @author longquan
 * @date 2020/5/23 4:20 下午
 *
 * 类适配器---电压适配器
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{


    @Override
    public int output5V() {
        //  首先获取到220V的电压
        int src = output220V();
        //  220V电压不能直接输出，需要转换为5V
        int dst = src / 44;
        return dst;
    }
}
