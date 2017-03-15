package view;

import controller.Controller;
import model.entity.Client;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public class UserInterfaceImp implements UserInterface {
    private Client client;

    public UserInterfaceImp() {
        this.client = new Client(0, "Root");
    }

    @Override
    public String getAvailableOperations() {
        return(
                "0 - Balance status \n" +
                "1 - Product list \n" +
                "2 - Withdraw money\n" +
                "3 - Put money\n" +
                "4 - Buy product\n" +
                "5 - Exit\n" +
                "6 - help\n");
    }

    @Override
    public void getProductsInfo() {

    }

    @Override
    public void getPurseInfo() {

    }

    @Override
    public void makeOrder(int id) {

    }

    @Override
    public int withdraw() {
        return 0;
    }

    @Override
    public void startPoS() throws IOException {
        int input = 6;
        Scanner br = new Scanner(System.in);
        while (input != 5) {
            switch (input) {
                case 0:
                    System.out.println(Controller.getInstance().getOperation(Controller.BALANCE).doIt(client));
                    break;
                case 1 :
                    System.out.println(Controller.getInstance().getOperation(Controller.PRODUCT_LIST).doIt(client));
                    break;
                case 2 :
                    System.out.println(Controller.getInstance().getOperation(Controller.WITHDRAW_MONEY).doIt(client));
                    break;
                case 3 :
                    System.out.println("Insert money. Coins 1, 5, 10, 25, 50\n");
                    int money = br.nextInt();
                    System.out.println(Controller.getInstance().getOperation(Controller.PUT_MONEY).doIt(client, money));
                    break;
                case 4 :
                    System.out.println("Choose product\n");
                    System.out.println(Controller.getInstance().getOperation(Controller.PRODUCT_LIST).doIt());
                    int product = br.nextInt();
                    System.out.println(Controller.getInstance().getOperation(Controller.BUY_PRODUCT).doIt(client, product));
                    break;
                case 6 :
                    System.out.println(getAvailableOperations());
                    break;
            }
            input = br.nextInt();
        }
    }
}
