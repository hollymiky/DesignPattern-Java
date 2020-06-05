package com.ann;

/**
 * @author longquan
 *
 * 双分派：
 * 1. 不管类怎么变化，都能找到期望的方法运行，双分派意味着得到执行的操作取决于请求的种类和两个接收者的类型
 *
 * 假设此时增加一个Wait 状态类，参考Man、Woman，由于使用了双分派。只需增加一个Action子类即可在客户端调用即可，不需要改动任何其他类的代码
 */
public class Client {

    public static void main(String[] args) {
        //  创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //  成功
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("-----------------");

        //  失败
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("-----------------");

        //  待定
        Wait wait = new Wait();
        objectStructure.display(wait);
    }

}
