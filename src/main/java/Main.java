import java.util.Locale;

import entities.Account;
import entities.Client;
import exceptions.OperationException;
import services.AccountOperationService;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Client client1 = new Client(1, "Jake", "jake@email.com", "4799999999");
        Account acc1 = new Account(1, 500.00, client1);

        acc1.deposit(0.16);

        System.out.println(acc1.getBalance());

    }

}
