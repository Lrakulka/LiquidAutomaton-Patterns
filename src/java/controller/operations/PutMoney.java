package controller.operations;

import model.entity.Client;
import service.PurseService;

/**
 * Created by Oleksandr_Borysov on 3/15/2017.
 */
public class PutMoney implements Operation {
    private PurseService  purseService;

    public PutMoney(PurseService purseService) {
        this.purseService = purseService;
    }

    @Override
    public String doIt(Object... args) {
        Client client = (Client) args[0];
        Integer money = (Integer) args[1];
        if (purseService.put(money, client)) {
            return "Operation successful";
        } else {
            return "Operation unsuccessful";
        }
    }
}
