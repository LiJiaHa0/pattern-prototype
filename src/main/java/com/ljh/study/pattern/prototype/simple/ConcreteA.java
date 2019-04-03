package com.ljh.study.pattern.prototype.simple;

import java.util.List;

/**
 * @description: 具体实现的原型
 * @author: Jh Lee
 * @create: 2019-04-03 22:45
 **/
public class ConcreteA implements Prototype {

    private int age;

    private String name;

    private List hobbies;

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //浅克隆
    public Prototype clone() {
        ConcreteA c = new ConcreteA();
        c.setAge(this.age);
        c.setName(this.name);
        c.setHobbies(this.hobbies);
        return c;
    }
}
