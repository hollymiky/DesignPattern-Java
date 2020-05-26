package com.ann;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longquan
 *
 * 学院
 */
public class College extends OrganizationComponent{

    // 这个list存放的是department
    List<OrganizationComponent> components = new ArrayList<>();

    public College(String name, String des) {
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
     * 输出college包含的系
     */
    @Override
    protected void print() {
        System.out.println("--------" + getName() + "------------");
        //  遍历当前学院所包含的系
        for (OrganizationComponent component:components) {
            System.out.println("--------" + component.getName() + "------------");
        }
    }
}
