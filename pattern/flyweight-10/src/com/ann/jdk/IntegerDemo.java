package com.ann.jdk;

/**
 * @author longquan
 *
 * Integer 享元模式的源码
 */
public class IntegerDemo {

    public static void main(String[] args) {
        /**
         * 如果Integer.valueOf(x) ，即 x 在 -128～ 127之间，就是使用享元模式
         * 如果不在这个范围内，仍然使用new的方式新建一个对象
         */

        /**
         * 如果使用valueOf方法得到一个Integer实例，范围在 -128~127，执行速度会比new Integer更快
         */

        //  得到x实例，类型Integer
        Integer x = Integer.valueOf(127);
        //  得到y实例，类型Integer
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        //  比较x与y的大小，true
        System.out.println(x.equals(y));

        //  比较x、y是否为同个对象，false
        System.out.println(x == y);

        //  true
        System.out.println(x == z);

        //  不同对象 false
        System.out.println(w == x);

        //  不同对象 false
        System.out.println(w == y);


        System.out.println("------------");

        //  超过范围，底层使用new形式创建一个新的实例
        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println(x1 == x2);
    }

    /**
     * valueOf源码：
     * public static Integer valueOf(int i) {
     *          // low = -128    high = 127
     *         if (i >= IntegerCache.low && i <= IntegerCache.high)
     *              // 从缓冲池中获取
     *             return IntegerCache.cache[i + (-IntegerCache.low)];
     *             // 否则返回一个新对象
     *         return new Integer(i);
     * }
     *
     */
}
