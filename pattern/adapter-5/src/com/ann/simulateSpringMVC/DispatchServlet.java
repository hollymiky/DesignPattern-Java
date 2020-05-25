package com.ann.simulateSpringMVC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author longquan
 */
public class DispatchServlet {
    
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();
    
    public DispatchServlet(){
        handlerAdapters.add(new AnnotationAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }
    
    public void doDispatch(){
        /**
         * 此处模拟SpringMVC从request中取handler的对象
         * 适配器可以获取到希望的Controller
         */
        HttpController controller = new HttpController();
        // AnnotationController controller = new AnnotationController();
        // SimpleController controller = new SimpleController();
        
        //  得到对应的适配器
        HandlerAdapter adapter = getHandler(controller);

        adapter.handle(controller);
    }

    //  获取对应的处理器适配器
    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter adapter: handlerAdapters) {
            if(adapter.support(controller)){
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
