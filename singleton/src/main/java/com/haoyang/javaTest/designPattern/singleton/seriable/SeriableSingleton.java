package com.haoyang.javaTest.designPattern.singleton.seriable;

import java.io.Serializable;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/14 15:14
 */
public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve() {return INSTANCE;}
}
