package com.ann.dynamicProxy2;

/**
 * @author longquan
 */
public class Client {

    public static void main(String[] args) {
        //  创建目标对象
        ITeacherDao target = new TeacherDao();

        //  给目标对象创建代理对象,可以转成ITeacherDao
        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();

        //  proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        //  通过代理对象调用目标对象的方法
        //proxyInstance.teach();

        proxyInstance.sayHello("Proxy...");
    }

}
