package com.gang.demo.pattern.singleton.task;

import com.gang.demo.pattern.singleton.Singleton;
import com.gang.demo.pattern.singleton.SingletonLaysz;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author ligang
 * @desc
 * @date 2019/7/7上午8:11
 **/
public class SingletonLayszTask implements Runnable {
    public SingletonLayszTask(){
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SingletonLaysz.getInstance();
    }
}
