package com.ann;

/**
 * @author longquan
 *
 * 投影仪
 */
public class Projector {

    private static Projector instance = new Projector();

    //  单例模式-饿汉式
    private Projector(){

    }

    public static Projector getInstance(){
        return instance;
    }

    //  功能
    public void on(){
        System.out.println(" projector on...");
    }

    public void off(){
        System.out.println(" projector off...");
    }

    public void focus(){
        System.out.println(" projector focus...");
    }
}
