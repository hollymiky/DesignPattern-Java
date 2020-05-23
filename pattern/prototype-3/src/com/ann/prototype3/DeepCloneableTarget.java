package com.ann.prototype3;

import java.io.Serializable;

/**
 * @author longquan
 * @date 2020/5/22 5:47 下午
 *
 * 深克隆
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = -3533620457349084320L;

    public String cloneName;
    public String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 因为该类的属性都为String，直接用默认clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
