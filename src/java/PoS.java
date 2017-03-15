import view.UserInterface;
import view.UserInterfaceImp;

import java.io.IOException;

/**
 * Created by Oleksandr_Borysov on 3/15/2017.
 */
public class PoS {

    public static void main(String... arg) throws IOException {
        UserInterface userInterface = new UserInterfaceImp();
        userInterface.startPoS();
    }
}
