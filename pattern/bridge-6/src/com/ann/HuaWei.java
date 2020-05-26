package com.ann;

/**
 * @author longquan
 */
public class HuaWei implements Brand {
    @Override
    public void open() {
        System.out.println("huawei..open..");
    }

    @Override
    public void close() {
        System.out.println("huawei..close..");
    }

    @Override
    public void call() {
        System.out.println("huawei..call..");
    }
}
