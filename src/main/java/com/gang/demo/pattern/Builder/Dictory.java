package com.gang.demo.pattern.Builder;

/**
 * @author ligang
 * @desc
 * @date 2019/7/10上午7:23
 **/
public class Dictory {

    private Builder builder;

    public Dictory(Builder builder){
        this.builder = builder;
    }

    public void constract(){
        builder.makeTitle("greeting");
        builder.makeString("早上好");
        builder.makeItem(new String[]{"晚上好", "晚安", "再见"});
        builder.close();
    }
}
