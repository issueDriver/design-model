package com.zuojei.prototype.deep;

public class Test {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng=new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng.jinGuPang==clone.jinGuPang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
