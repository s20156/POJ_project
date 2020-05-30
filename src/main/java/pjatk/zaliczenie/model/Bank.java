package pjatk.zaliczenie.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String bankID;

    private List<Account> accountList = new ArrayList<>();

    public void addAccount(int id, String name, int accountNumber, int moneyAmount) {
        Account newAccount = new Account(id, name, accountNumber, moneyAmount);
        accountList.add(newAccount);
    };
}
