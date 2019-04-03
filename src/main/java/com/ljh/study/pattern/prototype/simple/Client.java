package com.ljh.study.pattern.prototype.simple;

/**
 * @description:
 * @author: Jh Lee
 * @create: 2019-04-03 22:50
 **/
public class Client {

    //声明属性
    private Prototype prototype;

    //构造方法
    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype p){
        return p.clone();
    }

}
