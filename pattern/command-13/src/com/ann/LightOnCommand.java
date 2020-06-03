package com.ann;

/**
 * @author longquan
 *
 * 电灯开启命令
 */
public class LightOnCommand implements Command {

    //  需要聚合接收者 Receiver，这里聚合 LightReceiver

    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //  调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
