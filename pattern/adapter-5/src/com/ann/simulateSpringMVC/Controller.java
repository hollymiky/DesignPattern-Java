package com.ann.simulateSpringMVC;

/**
 * @author longquan
 *
 * 多种Controller实现
 */
public interface Controller {
}


class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("doHttpHandler...");
    }
}

class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("doSimpleHandler...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("doAnnotationHandler...");
    }
}