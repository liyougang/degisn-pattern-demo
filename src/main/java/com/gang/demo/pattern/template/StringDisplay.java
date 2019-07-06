package com.gang.demo.pattern.template;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6下午10:01
 **/
public class StringDisplay extends AbstractDisplay {
    private String content;

    public StringDisplay(String content){
        this.content = content;
    }
    public void open() {
       System.out.println("+-----+");
    }

    public void print() {
        for(int i =0; i< 5; i++){
            System.out.println("+"+content+"+");
        }
    }

    public void close() {
       System.out.println("+-----+");
    }
}
