package com.haoyang.javaTest.designPattern.singleton.test;


import com.haoyang.javaTest.designPattern.singleton.lazy.LazySimpleSingleton;
import com.haoyang.javaTest.designPattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
