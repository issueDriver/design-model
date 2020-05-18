package com.zuojei.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

/**
 * desc:任务分发者 主要完成url的映射和调用
 */
public class SelvletDispatcher {
    private List<Handler> handlerMapping = new ArrayList<Handler>();
    public SelvletDispatcher() {
        try {
            Class clazz  = MemberAction.class;
            handlerMapping.add(new Handler()
                    .setController(clazz.newInstance())
                    .setMethod(clazz.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json")
            );

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    private void  doService(HttpServletRequest request, HttpServletResponse response){
        doDispatch(request,response);
    }

}
