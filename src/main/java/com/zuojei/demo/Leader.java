package com.zuojei.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * desc：leader 委派者 任务分发的作用
 */
public class Leader implements IExcuter{

    private Map<String,IExcuter> targets = new HashMap<String,IExcuter>();

    public Leader() {
        targets.put("加密",new ExcuterA());
        targets.put("登录",new ExcuterB());
    }

    public void excute(String command) {
        targets.get(command).excute(command);

    }
}
