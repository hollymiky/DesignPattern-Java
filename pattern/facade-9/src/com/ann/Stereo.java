package com.ann;

/**
 * @author longquan
 *
 * 立体式音响
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    //  单例模式-饿汉式
    private Stereo(){

    }

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println(" stereo on...");
    }

    public void off(){
        System.out.println(" stereo off...");
    }

    public void up(){
        System.out.println(" stereo on...");
    }

    public void down(){
        System.out.println(" stereo off...");
    }
}
