package com.ann;

/**
 * @author longquan
 *
 * DVD播放器
 */
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    //  单例模式-饿汉式
    private DVDPlayer(){

    }

    public static DVDPlayer getInstance(){
        return instance;
    }


    //  功能
    public void on(){
        System.out.println(" DVD on...");
    }

    public void off(){
        System.out.println(" DVD off...");
    }

    public void play(){
        System.out.println(" DVD playing...");
    }

    public void pause(){
        System.out.println(" DVD pause...");
    }
}
