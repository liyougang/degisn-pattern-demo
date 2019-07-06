package com.gang.demo.pattern.factory.idcard;

import com.gang.demo.pattern.factory.framework.Product;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6上午8:17
 **/
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner){
        System.out.println("创建"+owner+"卡片");
        this.owner = owner;
    }

    public void use(){
        System.out.println("使用"+owner+"卡片");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
