package controller;

import controller.operations.*;
import model.Production;
import model.ProductionImp;
import service.ProductionService;
import service.ProductionServiceImp;
import service.PurseImp;
import service.PurseService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public class Controller {
    private Map<String, Operation> operations;
    private PurseService purseService;
    private ProductionService productionService;
    private Production production;
    private static Controller controller;

    public static final String BUY_PRODUCT = "BuyProduct";
    public static final String PRODUCT_LIST = "GetProductList";
    public static final String BALANCE = "GetBalance";
    public static final String PUT_MONEY = "PutMoney";
    public static final String WITHDRAW_MONEY = "WithdrawMoney";

    {
        production = ProductionImp.getProductionImp();
        purseService = new PurseImp(production);
        productionService = new ProductionServiceImp(production);
        operations = new HashMap<>();
        operations.put(BUY_PRODUCT, new BuyProduct(productionService, purseService));
        operations.put(PRODUCT_LIST, new GetProductList(productionService));
        operations.put(BALANCE, new GetPurseBalance(purseService));
        operations.put(PUT_MONEY, new PutMoney(purseService));
        operations.put(WITHDRAW_MONEY, new WithdrawMoney(purseService));
    }

    private Controller() {}

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public Operation getOperation(String operation) {
        return operations.get(operation);
    }
}
