package com.ann;

/**
 * @author longquan
 */
public class Client {

    public static void main(String[] args) {
        //  使用命令设计模式，完成通过遥控器，对电灯的操作

        //  创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();

        //  创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        //  创建电灯相关的关闭命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //  遥控器
        RemoteController remoteController = new RemoteController();

        //  给遥控器设置相关命令，假设： no=0是电灯的开与关的操作
        remoteController.setCommand(0, lightOnCommand,lightOffCommand);

        System.out.println("-----按下灯的开按钮-----");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----按下灯的关按钮-----");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----按下撤销按钮-----");
        remoteController.undoButtonWasPushed();

        System.out.println("======================================");

        //  创建电视的对象（接收者）
        TVReceiver tvReceiver = new TVReceiver();

        //  创建电视相关的开关命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        //  创建电视相关的关闭命令
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        //  给遥控器设置相关命令，假设： no=1是电视的开与关的操作
        remoteController.setCommand(1, tvOnCommand,tvOffCommand);
        System.out.println("-----按下电视的开按钮-----");
        remoteController.onButtonWasPushed(1);
        System.out.println("-----按下电视的关按钮-----");
        remoteController.offButtonWasPushed(1);
        System.out.println("-----按下撤销按钮-----");
        remoteController.undoButtonWasPushed();
    }

}
