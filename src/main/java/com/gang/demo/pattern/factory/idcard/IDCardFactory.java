package com.gang.demo.pattern.factory.idcard;

import com.gang.demo.pattern.factory.framework.Factory;
import com.gang.demo.pattern.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ligang
 * @desc
 * @date 2019/7/6上午8:21
 **/
public class IDCardFactory extends Factory {
    private List<Product> owners = new ArrayList<Product>();

    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    public void registerProduct(Product product) {
        owners.add(product);
    }

    public List<Product> getOwners() {
        return owners;
    }
}
