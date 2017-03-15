package service;

import model.Production;

import java.util.List;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public class ProductionServiceImp implements ProductionService {
    private Production production;

    public ProductionServiceImp(Production production) {
        this.production = production;
    }

    @Override
    public List<String> getProducts() {
        return production.getProductions();
    }
}
