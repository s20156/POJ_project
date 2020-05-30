package pjatk.zaliczenie;

import pjatk.zaliczenie.model.Account;
import pjatk.zaliczenie.model.Bank;
import pjatk.zaliczenie.model.User;
import pjatk.zaliczenie.service.BankingService;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(1,"Jan Kowalski", "56432467432123455643234564",523065);
        bank.addAccount(2, "Janusz Polski", "356735s34gdsa23", 167433225);
        bank.addAccount(3, "Piotr Bogaczewski", "256732", 25623);
        System.out.println(bank.findAll());

        //Walidacja

        Optional<Account> myAccount = bank.findById(1);
        System.out.println(myAccount);

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<String>> isAccountNumValid = validator.validate(myAccount.get().getAccountNumber());
        System.out.println(isAccountNumValid);

        BankingService bankingService = new BankingService(bank);
        System.out.println(bankingService.accountBalance(new User(myAccount.get().getId(), myAccount.get().getName())));
        System.out.println(bankingService.checkBankAndAccountCorrelation(myAccount));


    }
}
