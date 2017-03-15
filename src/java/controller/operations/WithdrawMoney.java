package controller.operations;

import model.entity.Client;
import service.PurseService;

/**
 * Created by Oleksandr_Borysov on 3/15/2017.
 */
public class WithdrawMoney implements Operation {
    private PurseService purseService;

    public WithdrawMoney(PurseService purseService) {
        this.purseService = purseService;
    }

    @Override
    public String doIt(Object... args) {
        Client client = (Client) args[0];
        return "Your change " + purseService.withdraw(client);
    }
}
