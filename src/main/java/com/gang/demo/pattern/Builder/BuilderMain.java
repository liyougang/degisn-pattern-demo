package com.gang.demo.pattern.Builder;

/**
 * @author ligang
 * @desc
 * @date 2019/7/10上午7:32
 **/
public class BuilderMain {
    public static void main(String[] args){
        TextBuilder textBuilder = new TextBuilder();
        Dictory textDictory = new Dictory(textBuilder);
        textDictory.constract();
        System.out.println(textBuilder.getResult());

        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Dictory htmlDictory = new Dictory(htmlBuilder);
        htmlDictory.constract();
        System.out.println(htmlBuilder.getResult());
    }
}
