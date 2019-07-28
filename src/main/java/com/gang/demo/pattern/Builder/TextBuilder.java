package com.gang.demo.pattern.Builder;


/**
 * @author ligang
 * @desc
 * @date 2019/7/10上午7:28
 **/
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String title) {
        buffer.append("------------------\n");
        buffer.append(title+"\n");
        buffer.append("------------------\n");
        buffer.append("\n");
    }

    public void makeString(String content) {
        buffer.append(content);
        buffer.append("\n");
    }

    public void makeItem(String[] items) {
        for(String item : items){
            buffer.append(item);
            buffer.append("\n");
        }
    }

    public void close() {
        buffer.append("------------------\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
