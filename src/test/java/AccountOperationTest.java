import entities.Account;
import entities.Client;
import org.junit.Assert;
import org.junit.Test;

public class AccountOperationTest {

    @Test
    public void shouldDepositAnAmount () {
        Client client1 = new Client(1, "Jake", "jake@email.com", "479999999");
        Account acc1 = new Account(1, 500.00, client1);

        acc1.deposit(150.00);
        double result = acc1.getBalance();

        Assert.assertEquals(650.00, result, 0.0);

    }

    @Test
    public void shouldWithdrawAnAmount () {
        Client client1 = new Client(1, "Jake", "jake@email.com", "479999999");
        Account acc1 = new Account(1, 500.00, client1);

        acc1.withdraw(400);
        double result = acc1.getBalance();

        Assert.assertEquals(100.00, result, 0.0);
    }

    @Test
    public void shouldTransferFromAnAccountToOther () {
        Client client1 = new Client(1, "Jake", "jake@email.com", "9999999");
        Account acc1 = new Account(1, 500.00, client1);

        Client client2 = new Client(2, "Robert", "robert@email.com", "98888888");
        Account acc2 = new Account(2, 500.00, client2);

        acc1.transfer(150, acc2);
        double result = acc2.getBalance();

        Assert.assertEquals(650.00, result, 0.0);
    }

}
