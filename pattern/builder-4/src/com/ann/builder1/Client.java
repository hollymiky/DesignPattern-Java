package com.ann.builder1;

/**
 * @author longquan
 * @date 2020/5/23 11:36 上午
 *
 * 分析问题：
 * 1. 优点是比较好理解，简单易操作
 * 2. 设计的程序结果，过于简单，没有设计缓存层对象，程序的扩展和维护不好，
 *    也就是说这种设计方案，把产品（这里指的即是：房子）和创建产品的过程（建房子流程）封装在一起，耦合性增强了
 * 3. 解决方案：将产品和产品建造过程解藕=>**建造者模式**
 *
 * 参考com.ann.improve包
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.builder();
    }

}
