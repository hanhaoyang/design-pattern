package com.haoyang.javaTest.designPattern.homework.shadow;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/15 15:45
 */
public class Teacher {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "teacher [name=" + name + ", age=" + age + "]";
    }
}
