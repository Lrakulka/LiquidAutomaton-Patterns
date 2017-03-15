package controller.operations;

import model.entity.Client;
import model.entity.Product;
import service.ProductionService;
import service.PurseService;

/**
 * Created by Oleksandr_Borysov on 3/15/2017.
 */
public class BuyProduct implements Operation {
    private ProductionService productionServiceImp;
    private PurseService purseService;

    public BuyProduct(ProductionService productionService, PurseService purseService) {
        this.productionServiceImp = productionService;
        this.purseService = purseService;
    }

    @Override
    public String doIt(Object... args) {
        Client client = (Client) args[0];
        Integer productId = (Integer) args[1];
        Product product = purseService.makePayment(productId, client);
        if (product == null) {
            return "Sorry, not enough money";
        }
        return "Take your " + product + ", please";
    }
}
