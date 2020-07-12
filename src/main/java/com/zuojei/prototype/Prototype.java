package com.zuojei.prototype;

import java.util.ArrayList;

/**
 * auhtorz;zuojie
 */
public class Prototype implements Cloneable{

    public String name;

    public ArrayList<String> list=new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
