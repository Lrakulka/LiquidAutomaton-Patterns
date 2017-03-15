package service;

import model.Production;
import model.entity.Client;
import model.entity.Product;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public class PurseImp implements PurseService {
    private Production production;

    public PurseImp(Production production) {
        this.production = production;
    }

    @Override
    public Product makePayment(int id, Client client) {
        Product product = production.get(id);
        if (product == null || !canAfford(product, client)) {
            return null;
        }
        client.setMoney(client.getMoney() - product.getPrice());
        // 0production.remove(id);
        return product;
    }

    @Override
    public boolean canAfford(Product product, Client client) {
        return client.getMoney() - product.getPrice() >= 0;
    }

    @Override
    public int balance(Client client) {
        return client.getMoney();
    }


    @Override
    public boolean put(int money, Client client) {
        if (!canPut(money)) {
            return false;
        }
        client.setMoney(client.getMoney() + money);
        return true;
    }

    @Override
    public boolean canPut(int money) {
        switch (money) {
            case 1: return true;
            case 5: return true;
            case 10: return true;
            case 25: return true;
            case 50: return true;
        }
        return false;
    }

    @Override
    public int withdraw(Client client) {
        int money = client.getMoney();
        client.setMoney(0);
        return money;
    }
}
