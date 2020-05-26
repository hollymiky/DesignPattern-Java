package com.ann;

/**
 * @author longquan
 *
 * 屏幕
 */
public class Screen {

    private static Screen instance = new Screen();

    //  单例模式-饿汉式
    private Screen(){

    }

    public static Screen getInstance(){
        return instance;
    }

    //  功能
    public void up(){
        System.out.println(" screen on...");
    }

    public void down(){
        System.out.println(" screen off...");
    }

}
