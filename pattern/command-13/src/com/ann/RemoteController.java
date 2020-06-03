package com.ann;

/**
 * @author longquan
 *
 * 遥控器
 */
public class RemoteController {

    //  开  按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    //  执行撤销命令
    Command undoCommand;

    //  构造器，完成对按钮初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        //  初始化
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //  给按钮设置需要的命令
    public void setCommand(int no, Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //  按下开按钮
    public void onButtonWasPushed(int no){
        //  找到按下开的按钮，并调用对应方法
        onCommands[no].execute();
    }
}