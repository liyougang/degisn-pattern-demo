package com.gang.demo.pattern.template;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6下午9:59
 **/
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public void display(){
        open();
        print();
        close();
    }
}
