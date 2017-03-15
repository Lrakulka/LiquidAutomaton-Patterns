package service;

import model.entity.Client;
import model.entity.Product;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public interface PurseService {
    boolean put(int money, Client client);

    boolean canPut(int money);

    int withdraw(Client client);

    Product makePayment(int id, Client client);

    boolean canAfford(Product product, Client client);

    int balance(Client client);
}
