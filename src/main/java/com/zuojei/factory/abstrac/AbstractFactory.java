package com.zuojei.factory.abstrac;

import com.zuojei.factory.Milk;

/**
 * author:用户的主入口
 * desc:zuojie
 * 在spring运用的最广泛的一种模式
 */
public abstract class AbstractFactory {
    public abstract Milk getMengniu();
    public abstract Milk getYili();
    public abstract Milk getTelunsu();
    public abstract Milk getXiaofan();
}
