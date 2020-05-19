package com.ann.improve;

/**
 * @author longquan
 * @date 2020/5/19 3:27 下午
 * <p>
 * 里氏替换原则---优化LiskovSubstitution01中的不规范、
 * <p>
 * 通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚合，组合等关系代替
 */
public class LiskovSubstitution02 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("9-8=" + a.func1(9, 8));
        System.out.println("-----------------------");

        B b = new B();
        //  因为类B不再继承于类A，所以func1不再是相减,调用完成的功能就会很明确
        System.out.println("9+8=" + b.func1(9, 8));
        System.out.println("3+2+1=" + b.func2(3, 2));

        System.out.println("-----------------------");
        //  使用组合仍然可以使用到A类中的方法
        System.out.println("9-8=" + b.func3(9, 8));
    }
}

/**
 * 首先，创建一个更加基础的基类
 */
class Base {
    //  更加的基础的方法、成员都写到base中
}

/**
 * 类A
 */
class A extends Base {
    //  两数相减
    public int func1(int a, int b) {
        return a - b;
    }
}

/**
 * B类继承于Base，如果B类还要用到类A中的方法
 * 可以考虑使用：依赖、聚合、组合等方式
 */
class B extends Base {

    //  组合方式
    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 1;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }

}

