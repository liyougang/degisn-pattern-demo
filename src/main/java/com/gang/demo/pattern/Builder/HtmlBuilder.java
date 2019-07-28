package com.gang.demo.pattern.Builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ligang
 * @desc
 * @date 2019/7/10下午9:16
 **/
public class HtmlBuilder extends Builder {
    private FileWriter fw;
    private File  file;
    public void makeTitle(String title) {
        file = new File(title + ".html");

        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeString("<htm>");
        writeString("<body>");
        writeString("<h1>"+title+"</h1>");
    }

    public void makeString(String content) {
        writeString("<p>"+content+"</p>");
    }

    public void makeItem(String[] items) {
        writeString("<ul>");
        for(String item : items){
            writeString("<li>"+item+"</li>");
        }
        writeString("</ul>");
    }

    public void close() {
        try {
            writeString("</body>");
            writeString("</htm>");

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeString(String content){
        try {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getResult(){
        return file.getAbsolutePath();
    }
}
