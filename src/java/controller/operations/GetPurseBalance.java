package controller.operations;

import model.entity.Client;
import service.PurseService;

/**
 * Created by Oleksandr_Borysov on 3/15/2017.
 */
public class GetPurseBalance implements Operation {
    private PurseService purseService;

    public GetPurseBalance(PurseService purseService) {
        this.purseService = purseService;
    }

    @Override
    public String doIt(Object... args) {
        Client client = (Client) args[0];
        return String.valueOf(purseService.balance(client));
    }
}
