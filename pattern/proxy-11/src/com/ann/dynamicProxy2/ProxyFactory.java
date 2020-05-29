package com.ann.dynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author longquan
 */
public class ProxyFactory {

    //  维护一个目标代理对象，Object
    private Object target;

    //  构建构造器时，对目标对象target初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //  个体目标对象生成一个代理对象
    public Object getProxyInstance() {


        /**
         *
         * 说明：
         * @params1 ClassLoader loader 指定当前目标对象使用的类加载器
         * @params2 Class<?>[] interfaces 目标对象实现接口的类型，使用帆型的方法确认类型
         * @params3 InvocationHandler   事件处理，执行目标对象的方法时，会去触发事件处理器的方法（会把当前执行的目标对象方法作为参数传入）
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK开始代理....");
                        //  通过反射机制调用目标对象的方法
                        Object result = method.invoke(target,args);
                        System.out.println("JDK代理结束...");
                        return result;
                    }
                });

        }
}
