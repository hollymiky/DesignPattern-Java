package com.ann;

/**
 * @author longquan
 * @date 2020/5/18 16:25
 * <p>
 * 单一职责原则---发现问题
 * Single responsibility principle --- Found problem
 * <p>
 * 方式1：
 * 1. 在方法1的run方法中，违反了单一职责原则
 * 2. 解决方案：根据交通工具运行的方式不同，分解成不同的类即可
 * 参考 com.ann.SingleResponsibility02
 * <p>
 * -------
 * 1. In the run method of method1, the principle of single responsibility is violated
 * 2. Solution: According to different modes of transportation, it can be broken down into different categories
 * reference com.ann.SingleResponsibility02
 */
public class SingleResponsibility01 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        //  run方法可以直接运行所有交通工具，显然不对。
        //  run method directly run all traffic tools,this is a mistake.
        vehicle.run("car");
        vehicle.run("ship");
        vehicle.run("plane");
    }
}


/**
 * 交通工具类
 * <p>
 * The traffic tools class
 */
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " driving on the highway.");
    }
}
