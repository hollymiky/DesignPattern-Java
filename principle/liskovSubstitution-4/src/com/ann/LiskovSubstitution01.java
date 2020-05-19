package com.ann;

/**
 * @author longquan
 * @date 2020/5/19 3:10 下午
 * <p>
 * 里氏替换原则---发现问题
 * <p>
 * Liskov Substitution Principle---found problem
 *
 * 我们发现原来运行正常的相减功能发生了错误。原因就是类B无意中重写了父类的方法，
 * 造成原有功能出现错误。在实际编程中，我们常常会通过重写父类的方法完成新的功能，
 * 这样写起来虽然简单，但整个继承体系的复用性会比较差。特别是运行多态比较繁琐的时候
 *
 * 具体解决方案参考 com.ann.improve.LiskovSubstitution02
 */
public class LiskovSubstitution01 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("9-8=" + a.func1(9, 8));
        System.out.println("-----------------------");

        B b = new B();
        //  此时使用的是B类中重写的func1方法
        System.out.println("9-8=" + b.func1(9, 8));
        System.out.println("3+2+1=" + b.func2(3, 2));
    }
}

/**
 * 类A
 */
class A {
    //  两数相减
    public int func1(int a, int b) {
        return a - b;
    }
}

/**
 * 类B继承类A，新增一个func2方法
 * 完成两个数相加然后再加1求和
 */
class B extends A {

    /**
     * 假设无意间重写了func1
     */
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 1;
    }

}
