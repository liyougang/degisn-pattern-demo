package com.gang.demo.pattern.singleton;

import com.gang.demo.pattern.singleton.task.SingletonLayszTask;
import com.gang.demo.pattern.singleton.task.SingletonTask;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author ligang
 * @desc
 * @date 2019/7/7上午8:06
 **/
public class SingletonLayszMain {

    public static void main(String[] args){
        int threads = 100;
        Executor executor = Executors.newFixedThreadPool(threads);
        for(int i = 0; i<threads; i++){
            executor.execute(new SingletonLayszTask());
        }
    }
}
