package pjatk.zaliczenie.model;

public class Account extends User {
    private int accountNumber;
    private int moneyAmount;

    public Account(int id, String name, int accountNumber, int moneyAmount) {
        super(id, name);
        this.accountNumber = accountNumber;
        this.moneyAmount = moneyAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}
