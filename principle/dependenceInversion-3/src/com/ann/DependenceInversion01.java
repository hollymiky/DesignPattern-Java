package com.ann;

/**
 * @author longquan
 * @date 2020/5/19 10:41 上午
 *
 * 依赖倒转原则---发现问题
 *
 * Dependence Inversion Principle--- Found problem
 *
 * ----------
 * 方式1：
 * 1. 比较容易想到
 * 2. 如果此时获取的消息是qq、微信、短信，就要新增类，Person类也要新增相应的接收方法
 * 3. 解决：引入一个抽象的接口 IReceiver，表示接收者，这样Person类与接口发生依赖
 *         因为email、微信、短信等都属于接收的范围，它们都去实现IReceiver接口即可，这样就符合依赖倒转原则
 */
public class DependenceInversion01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{

    public String getInfo(){
        return "email msg: hello world!";
    }

}

/**
 * 完成Person接收消息的功能
 */
class Person{

    /**
     * @param email 这里直接使用Email类作为形参，依赖了Email类
     */
    public void receive(Email email){
        System.out.println(email.getInfo());
    }

}
