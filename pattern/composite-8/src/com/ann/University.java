package com.ann;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longquan
 * <p>
 * 大学---就是Composite角色，管理College
 */
public class University extends OrganizationComponent {

    //  该list存放的college
    List<OrganizationComponent> components = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    //  重写add方法
    @Override
    protected void add(OrganizationComponent component) {
        components.add(component);
    }

    //  重写remove方法
    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    /**
     * 输出university包含的学院
     */
    @Override
    protected void print() {
        System.out.println("--------" + getName() + "------------");
        //  遍历当前大学所包含的学院
        for (OrganizationComponent component:components) {
            System.out.println("--------" + component.getName() + "------------");
        }
    }
}
