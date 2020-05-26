package com.ann;

/**
 * @author longquan
 * <p>
 * <p>
 * 外观模式--也叫过程模式
 * <p>
 * 提出问题： 组建一个家庭影院
 * 设备：DVD播放器、投影仪、自动屏幕、环绕立体声、爆米花机，要求完成使用家庭影院的功能
 * 过程：直接用遥控器：统筹各设备开关->开爆米花机->放下屏幕->开投影仪->开音响->开DVD，选DVD->去拿爆米花->调暗灯光->播放->观影结束后，关闭设备
 * <p>
 * 1. 传统方式解决：每个设备与家庭影院类产生依赖
 * 问题：
 * a. 在Client的main方法中，创建各个子系统的对象，并直接调用子系统（对象）的相关方法，会造成调用过程混乱，没有清晰的过程
 * b. 不利于在Client中，去维护对子系统的操作
 * c. 解决思路：定义一个高层接口，给子系统的一组接口提供一个 一致的界面（比如在高层接口提供4个方法ready、play、pause、end），用来访问子系统中的一群接口
 * d. 也就是说就是通过定义一个一致的接口（界面类），用以屏蔽内部子系统的细节，使得调用端只需跟这个接口发生调用，而无需关系这个子系统的内部细节【即 外观模式】
 *
 *
 * 调用者：外观接口的调用者
 *
 *
 * 外观模式就是解决多个复杂接口带来的使用困难，起到简化用户操作的作用
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("----------------");
        homeTheaterFacade.play();
        System.out.println("----------------");
        homeTheaterFacade.pause();
        System.out.println("----------------");
        homeTheaterFacade.end();
    }

}
