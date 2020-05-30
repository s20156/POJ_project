package pjatk.zaliczenie.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private String name;
    private String bankID;

    private List<Account> accountList = new ArrayList<>();
    public List<Account> findAll() {return this.accountList;}
    public Optional<Account> findById(int id) {
        return accountList.stream().filter(account -> account.getId() == id).findFirst();
    }

    public void addAccount(int id, String name, String accountNumber, int moneyAmount) {
        Account newAccount = new Account(id, name, accountNumber, moneyAmount);
        accountList.add(newAccount);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }
}
