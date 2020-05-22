package com.ann.prototype1.improve;


/**
 * @author longquan
 * @date 2020/5/22 4:44 下午
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("使用原型模式-完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        //....

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }

}
