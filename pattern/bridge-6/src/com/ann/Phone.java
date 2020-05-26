package com.ann;

/**
 * @author longquan
 *
 * 抽象类-phone
 */
public abstract class Phone {

    //  组合品牌
    private Brand brand;

    //  使用构造器聚合
    public Phone(Brand brand){
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }

}
