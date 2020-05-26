package com.ann;

/**
 * @author longquan
 *
 * 灯光
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    //  单例模式-饿汉式
    private TheaterLight(){

    }

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" theaterLight on...");
    }

    public void off(){
        System.out.println(" theaterLight off...");
    }

    //  灯光调暗
    public void dim(){
        System.out.println(" theaterLight on...");
    }

    public void bright(){
        System.out.println(" theaterLight off...");
    }
}
