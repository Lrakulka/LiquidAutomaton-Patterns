package model;

import model.entity.Product;

import java.util.List;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public interface Production <T> {
    Product get(int id);

    boolean isContains(int id);

    boolean isContains(Product product);

    Product remove(T key);

    List<String> getProductions();
}
