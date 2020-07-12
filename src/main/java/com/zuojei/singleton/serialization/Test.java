package com.zuojei.singleton.serialization;


import java.io.*;

public class Test {
    public static void main(String[] args) {
        Seriable s1=null;
        Seriable s2=Seriable.getInstance();
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("Seriable.obj");
            ObjectOutputStream obs=new ObjectOutputStream(fos);
            obs.writeObject(s2);
            obs.flush();
            obs.close();

            FileInputStream fis=new FileInputStream("Seriable.obj");
            ObjectInputStream ois=new ObjectInputStream(fis);
            s1= (Seriable) ois.readObject();
            System.out.println(s1==s2);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
