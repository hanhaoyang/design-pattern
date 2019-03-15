package com.haoyang.javaTest.designPattern.singleton.threadlocal;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/14 15:23
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
