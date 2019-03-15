package com.haoyang.javaTest.designPattern.singleton.hungry;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/14 14:11
 */
//饿汉式静态块单例
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
