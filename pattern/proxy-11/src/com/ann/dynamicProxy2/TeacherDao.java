package com.ann.dynamicProxy2;

/**
 * @author longquan
 * 不直接调用，使用代理去调用
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中...");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
