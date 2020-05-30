package pjatk.zaliczenie.service;

import pjatk.zaliczenie.model.Account;
import pjatk.zaliczenie.model.Bank;
import pjatk.zaliczenie.model.User;

import java.math.BigDecimal;
import java.util.Optional;

public class BankingService {
    private Bank bank = new Bank();

    public BankingService(Bank bank) {
        this.bank = bank;
    }

    public int accountBalance(User user) {
        Optional<Account> myAccount = bank.findById(user.getId());
        return myAccount.get().getMoneyAmount();
    }

    public Optional<Account> getAccountForUser(User user) {
        return bank.findById(user.getId());
    }

    public boolean checkBankAndAccountCorrelation(Optional<Account> account) {
        if (account.get().getAccountNumber().indexOf(bank.getBankID()) == 2) {
            return true;
        } else {
            return false;
        }
    }
}
