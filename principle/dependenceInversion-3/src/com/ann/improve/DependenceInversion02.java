package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/19 10:50 上午
 *
 * 依赖倒转原则---优化方式1
 *
 * 引入一个抽象的接口 IReceiver，表示接收者，这样Person类与接口发生依赖
 *
 * email、微信、短信等都属于接收的范围，它们都去实现IReceiver接口即可，这样就符合依赖倒转原则
 */
public class DependenceInversion02 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receiver(new WeChat());
        System.out.println("----------------");
        person.receiver(new QQ());
        System.out.println("----------------");
        person.receiver(new Email());
    }
}

interface IReceiver{
    String getMsg();
}

class Email implements IReceiver{

    @Override
    public String getMsg() {
        return "email msg: hello email";
    }
}

class WeChat implements IReceiver{

    @Override
    public String getMsg() {
        return "wechat msg: hello wechat";
    }
}

class QQ implements IReceiver{

    @Override
    public String getMsg() {
        return "qq msg: hello qq";
    }
}

class Person{

    public void receiver(IReceiver receiver){
        System.out.println(receiver.getMsg());
    }
}
