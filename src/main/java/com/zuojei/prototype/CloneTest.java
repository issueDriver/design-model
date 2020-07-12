package com.zuojei.prototype;

/**
 * auhtor:zuojie
 */

public class CloneTest {
    public static void main(String[] args) {

        Prototype p=new Prototype();
        p.name="zuojie";
        p.list.add("a");
        try {
            Prototype obj = (Prototype) p.clone();
            System.out.println(obj.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
