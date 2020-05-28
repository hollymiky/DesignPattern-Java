package com.ann.staticProxy1;

/**
 * @author longquan
 * 不直接调用，使用代理去调用
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中...");
    }
}
