package com.gang.demo.pattern.template;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6下午10:07
 **/
public class TemplateMain {

    public static void main(String[] args){
        CharDidplay charDisplay = new CharDidplay('a');
        StringDisplay stringDisplay = new StringDisplay("abc");

        charDisplay.display();
        System.out.println();
        stringDisplay.display();
    }
}
