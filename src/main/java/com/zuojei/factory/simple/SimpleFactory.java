package com.zuojei.factory.simple;

import com.zuojei.factory.Milk;
import com.zuojei.factory.Telunshu;
import com.zuojei.factory.xiaofan;

/**
 * author;zuojie
 */
public class SimpleFactory {
    public Milk getMilk(String name){
        if("特伦舒".equals(name)){
            return new Telunshu();
        }if("小凡牌".equals(name)){
            return new xiaofan();
        }
        return null;


    }
}
