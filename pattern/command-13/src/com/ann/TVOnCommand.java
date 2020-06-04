package com.ann;

/**
 * @author longquan
 *
 * 电视开启命令
 */
public class TVOnCommand implements Command {

    //  需要聚合接收者 Receiver，这里聚合 TVReceiver

    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver){
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        //  调用接收者的方法
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
