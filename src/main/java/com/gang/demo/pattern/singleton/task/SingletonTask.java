package com.gang.demo.pattern.singleton.task;

import com.gang.demo.pattern.singleton.Singleton;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author ligang
 * @desc
 * @date 2019/7/7上午8:11
 **/
public class SingletonTask implements Runnable {
    private CyclicBarrier cyclicBarrier;
    private int threadName;
    public SingletonTask(CyclicBarrier cyclicBarrier, int threadName){
        this.cyclicBarrier = cyclicBarrier;
        this.threadName = threadName;
    }

    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Singleton.getInstance();
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
