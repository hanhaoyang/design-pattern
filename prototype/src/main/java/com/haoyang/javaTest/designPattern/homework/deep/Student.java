package com.haoyang.javaTest.designPattern.homework.deep;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/15 15:21
 */
public class Student implements Cloneable{
    private String name;
    private int age;
    private Teacher teacher;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", teacher=" + teacher + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student newStudent = (Student) super.clone();
        newStudent.teacher = (Teacher) teacher.clone();
        return newStudent;
    }
}
