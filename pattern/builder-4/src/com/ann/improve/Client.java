package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/23 2:14 下午
 */
public class Client {

    public static void main(String[] args) {
        //  盖普通房
        CommonHouse commonHouse = new CommonHouse();
        //  准备创建房子的指挥者
        HouseDirector director = new HouseDirector(commonHouse);

        //  完成盖房，返回产品
        House house1 = director.constructHouse();

        System.out.println("-------------------------");

        //  建造高楼
        HighBuilding highBuilding = new HighBuilding();
        director.setHouseBuilder(highBuilding);
        //  完成盖房，返回产品
        House house2 = director.constructHouse();
    }
}
