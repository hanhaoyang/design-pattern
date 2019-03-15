package com.haoyang.javaTest.designPattern.homework.deep;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/15 15:29
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(30);
        t1.setName("James");

        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("hanhaoyang");
        s1.setTeacher(t1);

        System.out.println(s1);

        try {
            Student s2 = (Student) s1.clone();
            s2.setAge(20);
            s2.setName("haoyang");
            Teacher t2 = s2.getTeacher();
            t2.setAge(32);
            t2.setName("Tom");
            s2.setTeacher(t2);
            System.out.println("复制前的：s1 = " + s1);
            System.out.println("复制后的：s2 = " + s2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
