package pjatk.zaliczenie.model;

import java.math.BigDecimal;

public class Account extends User {
    private String accountNumber;
    private int moneyAmount;

    public Account(int id, String name, String accountNumber, int moneyAmount) {
        super(id, name);
        this.accountNumber = accountNumber;
        this.moneyAmount = moneyAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

}
