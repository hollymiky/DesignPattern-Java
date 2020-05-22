package com.ann;

/**
 * @author longquan
 * @date 2020/5/22 3:53 下午
 *
 * 克隆羊---使用传统方式
 *
 * 分析：
 * 1. 优点是比较好理解，简单易操作
 * 2. 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低。
 * 3. 总是需要重新初始化对象，而不是动态地获取对象运行时的状态，不够灵活
 *
 * 优化参考 com.ann.improve包中的方案
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        // .... 克隆10只

        System.out.println(sheep);
        System.out.println(sheep1);
        // ....
    }
}
