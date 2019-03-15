package com.haoyang.javaTest.designPattern.prototype.simple;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/15 14:25
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
        return (Prototype)concretePrototype.clone();
    }
}
