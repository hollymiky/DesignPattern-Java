package com.ann;

/**
 * @author longquan
 * @date 2020/5/18 4:44 下午
 * <p>
 * 单一职责原则---解决方案1---使用类级别分解
 * <p>
 * Single responsibility principle --- The solution one
 * <p>
 * 方式2：
 * 1. 遵守了单一职责原则
 * 2. 但是这种做法涉及的改动很大，即将类分解，并且在客户端需要改动
 * 3. 改进：com.ann.Vehicle 类，改动的代码会比较少
 * 参考 com.ann.SingleResponsibility03
 *
 * -------
 * 1. Abide by the principle of single responsibility
 * 2. But this method involves a lot of changes, that is, class decomposition, and the client needs to be changed
 * 3. Improvement: com.ann.Vehicle , less changed code
 * reference com.ann.SingleResponsibility03
 */
public class SingleResponsibility02 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        OceanVehicle oceanVehicle = new OceanVehicle();
        roadVehicle.run("car");
        airVehicle.run("plane");
        oceanVehicle.run("ship");
    }

}

/**
 * 公路-交通工具
 * Road - traffic tools
 */
class RoadVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " driving on the highway.");
    }
}

/**
 * 空中-交通工具
 * Air - traffic tools
 */
class AirVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " driving on the air.");
    }
}

/**
 * 海上-交通工具
 * Ocean - traffic tools
 */
class OceanVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " driving on the ocean.");
    }
}
