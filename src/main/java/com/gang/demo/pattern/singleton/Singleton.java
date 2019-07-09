package com.gang.demo.pattern.singleton;

/**
 * @author ligang
 * @desc
 * @date 2019/7/7上午8:03
 **/
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){
        System.out.println("create instance");
    }

    public static Singleton getInstance(){
        return instance;
    }
}
