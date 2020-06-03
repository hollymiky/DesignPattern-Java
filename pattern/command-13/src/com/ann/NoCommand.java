package com.ann;

/**
 * @author longquan
 *
 * 空操作:没有任何命令
 * 为什么要有这个空操作？
 *
 * 用于初始化每个按钮，当调用空命令时对象什么都不做；
 * 其实这也是一种设计模式，可以省掉对空判断
 */
public class NoCommand implements Command{



    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
