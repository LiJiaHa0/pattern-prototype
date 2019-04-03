package com.ljh.study.pattern.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @description: 美猴王
 * @author: Jh Lee
 * @create: 2019-04-03 23:02
 **/
public class MonkeyKing extends Monkey {

    private GoldenCudgel goldenCudgel;

    public MonkeyKing(GoldenCudgel goldenCudgel) {
        this.goldenCudgel = goldenCudgel;
    }

    public Object deepCloone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            MonkeyKing copy = (MonkeyKing) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
