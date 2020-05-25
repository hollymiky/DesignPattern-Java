package com.ann.simulateSpringMVC;

/**
 * @author longquan
 *
 * 定义一个Adapter接口，处理器适配器
 */
public interface HandlerAdapter {

    boolean support(Object handler);

    void handle(Object handler);
}

/**
 * 多种适配器类
 */

class SimpleHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
       return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}

class HttpHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}

class AnnotationAdapter implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}


