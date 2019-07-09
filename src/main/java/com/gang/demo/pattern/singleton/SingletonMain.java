package com.gang.demo.pattern.singleton;

import com.gang.demo.pattern.singleton.task.SingletonTask;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author ligang
 * @desc
 * @date 2019/7/7上午8:06
 **/
public class SingletonMain {

    public static void main(String[] args){
        int threadSize = 100;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(threadSize);
        Executor executor = Executors.newFixedThreadPool(threadSize);
        for(int i = 0; i <threadSize; i++){
            executor.execute(new SingletonTask(cyclicBarrier, i));
        }
    }
}
