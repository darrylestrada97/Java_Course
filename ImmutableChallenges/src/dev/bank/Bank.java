package dev.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private final int routingNumber;
    private long lastTransactionId = 000_000_000_000_000;

    private Map<String, BankCustomer> customers = new HashMap<>();
    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
    }





    protected BankCustomer getCustomer(String id){
        return customers.get(id);
    }
    protected void  addCustomer(String name, double checkingInitialDeposit, double savingsInitialDeposit){
        BankCustomer customer = new BankCustomer(name,checkingInitialDeposit,savingsInitialDeposit);
        customers.put(customer.getCustomerId(),customer);
    }

    protected void doTransaction(String id, BankAccount.AccountType type, double amount){
        //Transaction transaction = new Transaction(routingNumber, (lastTransactionId + 1),(Integer) id,amount);
    }
}
