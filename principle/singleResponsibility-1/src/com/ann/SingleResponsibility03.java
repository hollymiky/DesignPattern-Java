package com.ann;

/**
 * @author longquan
 * @date 2020/5/18 4:54 下午
 * <p>
 * 单一职责原则---解决方案2---使用方法级别分解
 * <p>
 * Single responsibility principle --- The solution two
 * <p>
 * 方式3：
 * 1. 这种修改方式没有对原来的类做大的修改，只是增加了方法
 * 2. 虽然没有在类级别上遵守单一职责原则，但是在方法级别上仍然遵守了单一职责原则
 *
 * ------
 * 1. This modification method does not make major changes to the original class, but only adds methods.
 * 2. Although the principle of single responsibility is not observed at the class level,
 *    the principle of single responsibility is still observed at the method level.
 */
public class SingleResponsibility03 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("car");
        vehicle2.runAir("plane");
        vehicle2.runOcean("ship");
    }
}

class Vehicle2 {

    /**
     * road
     */
    public void run(String vehicle) {
        System.out.println(vehicle + " driving on the highway.");
    }

    /**
     * air
     */
    public void runAir(String vehicle) {
        System.out.println(vehicle + " driving on the air.");
    }

    /**
     * ocean
     */
    public void runOcean(String vehicle) {
        System.out.println(vehicle + " driving on the ocean.");
    }
}
