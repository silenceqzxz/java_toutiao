package com.nowcoder;

/**
 * Created by nowcoder on 2016/6/25.
 */
public class Animal implements Talking {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void say() {
        System.out.println("This is Animal");
    }
}
