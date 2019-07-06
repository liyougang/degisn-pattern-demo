package com.gang.demo.pattern.factory.framework;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6上午8:11
 **/
public abstract class Factory {
    public Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);

        return product;
    }

    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);
}
