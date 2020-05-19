package com.zuojei.factory.abstrac;

import com.zuojei.factory.Menglun;
import com.zuojei.factory.Milk;
import com.zuojei.factory.Telunshu;
import com.zuojei.factory.func.MenglunFactory;
import com.zuojei.factory.func.TelunsuFactory;
import com.zuojei.factory.func.XiaofanpaiFactory;
import com.zuojei.factory.simple.YILI;

/**
 * auhtor:zuojie
 */
public class MIlkFactory extends AbstractFactory {
    @Override
    public Milk getMengniu() {
        return new MenglunFactory().getMilk();
    }
    @Override
    public Milk getYili() {
        return new YILI();
    }
    @Override
    public Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }

    public Milk getXiaofan() {
        return new XiaofanpaiFactory().getMilk();
    }
}
