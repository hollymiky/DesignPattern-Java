package com.ann;

/**
 * @author longquan
 *
 * 其他样式
 */
public class OtherPhone extends Phone {


    public OtherPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("其他样式...");
    }
    public void close(){
        super.close();
        System.out.println("其他样式...");
    }
    public void call(){
        super.call();
        System.out.println("其他样式...");
    }
}
