package com.ann.prototype2;


/**
 * @author longquan
 * @date 2020/5/22 4:44 下午
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("使用原型模式-完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        //  浅克隆-验证引用类型是否被克隆
        sheep.friend = new Sheep("jack", 2, "黑色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        //....
        System.out.println("----------------------");

        /**
         * 会发现每个hashCode都相同，实际上引用类型只进行了引用传递，并没有真正的克隆，即浅克隆
         */

        System.out.println(sheep + " , friend hashCode= " + sheep.friend.hashCode());
        System.out.println(sheep1 + " , friend hashCode= " + sheep1.friend.hashCode());
        System.out.println(sheep2 + " , friend hashCode= " + sheep2.friend.hashCode());
        System.out.println(sheep3 + " , friend hashCode= " + sheep3.friend.hashCode());
        System.out.println(sheep4 + " , friend hashCode= " + sheep4.friend.hashCode());
    }

}
