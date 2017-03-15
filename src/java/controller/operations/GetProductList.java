package controller.operations;

import service.ProductionService;

/**
 * Created by Oleksandr_Borysov on 3/15/2017.
 */
public class GetProductList implements Operation {
    private ProductionService service;

    public GetProductList(ProductionService service) {
        this.service = service;
    }

    @Override
    public String doIt(Object... args) {
        StringBuilder buff = new StringBuilder();
        for (String line : service.getProducts()) {
            buff.append(line).append(System.lineSeparator());
        }
        return buff.toString();
    }
}
