package com.gang.demo.pattern.Builder;

/**
 * @author ligang
 * @desc
 * @date 2019/7/10上午7:21
 **/
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String content);

    public abstract void makeItem(String[] items);

    public abstract void close();

}
