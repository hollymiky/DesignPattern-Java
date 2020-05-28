package com.ann.staticProxy1;

/**
 * @author longquan
 *
 * 代理类,静态代理
 */
public class TeacherDaoProxy implements ITeacherDao {

    /**
     * 这个是目标对象，通过接口来聚合
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始...");

        System.out.println("代理结束...");
    }
}
