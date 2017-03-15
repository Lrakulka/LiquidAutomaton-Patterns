package model;

import model.entity.Product;

import java.util.*;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public class ProductionImp implements Production<Integer> {
    private Map<Integer, Product> productions;
    private static ProductionImp productionImp;

    {
        productions = new HashMap<>();
        productions.put(1, new Product(2341, 25, "Чай"));
        productions.put(2, new Product(2345, 35, "Кава"));
        productions.put(3, new Product(3345, 45, "Сік"));
    }
    private ProductionImp () {}

    public static ProductionImp getProductionImp() {
        if (productionImp == null) {
            productionImp = new ProductionImp();
        }
        return productionImp;
    }

    @Override
    public Product get(int id) {
        return productions.get(id);
    }

    @Override
    public boolean isContains(int id) {
        return productions.containsKey(id);
    }

    @Override
    public boolean isContains(Product product) {
        return isContains(product.getIdentifier());
    }

    @Override
    public Product remove(Integer key) {
        return productions.remove(key);
    }

    @Override
    public List<String> getProductions() {
        List<String> list = new ArrayList<>();
        for (Iterator i = productions.keySet().iterator(); i.hasNext();) {
            Integer key = (Integer) i.next();
            list.add(key + " = " + productions.get(key).toString());
        }
        return list;
    }
}
