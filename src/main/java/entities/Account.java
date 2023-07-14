package entities;

import enums.AccEnum;
import exceptions.OperationException;


public class Account {

    private Integer number;
    private double balance;
    private Client client;
    private AccEnum accEnum;

    public Account(Integer number, double balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
        this.accEnum = accEnum.CREATED;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) throws OperationException {
        if (amount < 1.00) {
            throw new OperationException("You must deposit at least $1.00");
        } else {
            balance += amount;
        }
    }

    public void withdraw (double amount) throws OperationException {
        if (balance <= 0) {
            throw new OperationException("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public void transfer (double amount, Account destinationAcc) {
        this.balance -= amount;
        destinationAcc.setBalance(destinationAcc.getBalance() + amount);
    }

    @Override
    public String toString() {
        return "Holder: " + client.getName()
                + "\nBalance: " + balance;
    }


}
