package com.ann;

/**
 * @author longquan
 * @date 2020/5/18 6:04 下午
 * <p>
 * 接口隔离原则---发现问题
 * <p>
 * interface segregation principle---found problem
 *
 * 类B、D分别实现了Interface1接口中的所有方法，类A通过接口的引用依赖了类B，
 * 但是类A只需要用到1、2、3方法，4、5方法不需要；
 * 类C通接口引用依赖了类D，但是类C只用到1、4、5方法，2、3方法不需要。
 * 这就违反了接口隔离原则
 */
public class InterfaceSegregation01 {

    public static void main(String[] args) {

    }

}

interface Interface1 {
    void method1();

    void method2();

    void method3();

    void method4();

    void method5();
}

/**
 * 类A通过Interface1接口依赖B类，但是只会用到1、2、3方法
 */
class A {
    public void use1(Interface1 interface1) {
        interface1.method1();
    }

    public void use2(Interface1 interface1) {
        interface1.method2();
    }

    public void use3(Interface1 interface1) {
        interface1.method3();
    }
}

class B implements Interface1 {

    @Override
    public void method1() {
        System.out.println("B method1");
    }

    @Override
    public void method2() {
        System.out.println("B method2");
    }

    @Override
    public void method3() {
        System.out.println("B method3");
    }

    @Override
    public void method4() {
        System.out.println("B method4");
    }

    @Override
    public void method5() {
        System.out.println("B method5");
    }
}

/**
 * 类C通过Interface1依赖D类，但是只使用1、4、5方法
 */
class C {
    public void use1(Interface1 interface1) {
        interface1.method1();
    }

    public void use2(Interface1 interface1) {
        interface1.method4();
    }

    public void use3(Interface1 interface1) {
        interface1.method5();
    }
}

class D implements Interface1 {

    @Override
    public void method1() {
        System.out.println("D method1");
    }

    @Override
    public void method2() {
        System.out.println("D method2");
    }

    @Override
    public void method3() {
        System.out.println("D method3");
    }

    @Override
    public void method4() {
        System.out.println("D method4");
    }

    @Override
    public void method5() {
        System.out.println("D method5");
    }
}

