package com.gang.demo.pattern.factory;

import com.gang.demo.pattern.factory.framework.Factory;
import com.gang.demo.pattern.factory.framework.Product;
import com.gang.demo.pattern.factory.idcard.IDCardFactory;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6上午8:24
 **/
public class IDFactoryMain {

    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("test1");
        Product card2 = factory.create("test2");
        Product card3 = factory.create("test3");

        card1.use();
        card2.use();
        card3.use();
    }
}
