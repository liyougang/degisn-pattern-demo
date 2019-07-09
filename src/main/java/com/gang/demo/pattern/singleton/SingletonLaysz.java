package com.gang.demo.pattern.singleton;

/**
 * @author ligang
 * @desc
 * @date 2019/7/7上午8:30
 **/
public class SingletonLaysz {
    private static SingletonLaysz instance = null;

    private SingletonLaysz(){
        System.out.println("init instance");
    }

    public synchronized static SingletonLaysz getInstance(){
        if(instance == null){
            instance = new SingletonLaysz();
        }

        return instance;
    }
}
