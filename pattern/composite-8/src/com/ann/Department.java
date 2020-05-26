package com.ann;

/**
 * @author longquan
 *
 * 系--节点、叶子
 * 因为系一下就没有包含其它的了，不需要管理其它单位
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("--------" + getName() + "------------");
    }
}
