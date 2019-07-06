package com.gang.demo.pattern.template;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6下午10:04
 **/
public class CharDidplay extends AbstractDisplay {
    private char context;

    public CharDidplay(char context){
        this.context = context;
    }


    public void open() {
        System.out.print("<");
    }

    public void print() {
        for(int i =0; i<5; i++){
            System.out.print(context);
        }
    }

    public void close() {
        System.out.print(">");
    }
}
