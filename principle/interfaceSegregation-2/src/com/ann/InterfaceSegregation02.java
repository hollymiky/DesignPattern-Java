package com.ann;

/**
 * @author longquan
 * @date 2020/5/19 9:51 上午
 * <p>
 * 接口隔离原则---将接口拆分成多个小接口
 */
public class InterfaceSegregation02 {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.use1(new ClassB());
        a.use2(new ClassB());
        a.use3(new ClassB());
        System.out.println("---------------------------");
        ClassC c = new ClassC();
        c.use1(new ClassD());
        c.use4(new ClassD());
        c.use5(new ClassD());
    }

}

interface InterfaceA {
    void method1();
}

interface InterfaceB {
    void method2();

    void method3();
}

interface InterfaceC {
    void method4();

    void method5();
}

/**
 * 类A通过Interface1接口依赖B类，但是只会用到1、2、3方法
 */
class ClassA {
    public void use1(InterfaceA interfaceA) {
        interfaceA.method1();
    }

    public void use2(InterfaceB interfaceB) {
        interfaceB.method2();
    }

    public void use3(InterfaceB interfaceB) {
        interfaceB.method3();
    }
}

class ClassB implements InterfaceA, InterfaceB {

    @Override
    public void method1() {
        System.out.println("ClassB method1");
    }

    @Override
    public void method2() {
        System.out.println("ClassB method2");
    }

    @Override
    public void method3() {
        System.out.println("ClassB method3");
    }
}

class ClassC {
    public void use1(InterfaceA interfaceA) {
        interfaceA.method1();
    }

    public void use4(InterfaceC interfaceC) {
        interfaceC.method4();
    }

    public void use5(InterfaceC interfaceC) {
        interfaceC.method5();
    }
}

class ClassD implements InterfaceA, InterfaceC {

    @Override
    public void method1() {
        System.out.println("ClassD method1");
    }

    @Override
    public void method4() {
        System.out.println("ClassD method4");
    }

    @Override
    public void method5() {
        System.out.println("ClassD method5");
    }
}
