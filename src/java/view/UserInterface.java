package view;

import java.io.IOException;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public interface UserInterface {
    String getAvailableOperations();

    void getProductsInfo();

    void getPurseInfo();

    void makeOrder(int id);

    int withdraw();

    void startPoS() throws IOException;
}
