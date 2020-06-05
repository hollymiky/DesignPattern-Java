package com.ann;

/**
 * @author longquan
 *
 * 说明：
 * 1. 这里使用到了双分派，即首先在客户端程序中将具体的状态作为参数传递到Woman中（第一次分派）
 * 2. 然后Woman类调用作为参数的"具体方法"中的方法getWomanResult,同时将自己this作为参数传入，完成第二次分派
 */
public class Woman extends Person{

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
