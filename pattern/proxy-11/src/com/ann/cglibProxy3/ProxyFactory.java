package com.ann.cglibProxy3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author longquan
 *
 * 1. 给目标对象创建一个代理对象 getInstance()
 * 2. 重写intecept()方法，实现对被代理对象（目标）方法的调用
 */
public class ProxyFactory implements MethodInterceptor {

    //  维护一个目标对象
    private Object target;

    //  构造器，传入被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }


    //  返回一个代理对象（是target对象的代理对象）
    public Object getProxyInstance(){
        //  1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //  2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //  3. 设置回调函数
        enhancer.setCallback(this);
        //  4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法，会调用目标对象的相关方法（类似JDK代理中的invoke）
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib开始代理...");
        Object result = method.invoke(target, args);
        System.out.println("Cglib结束代理...");
        return result;
    }
}
