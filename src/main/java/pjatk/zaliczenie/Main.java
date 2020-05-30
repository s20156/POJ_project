package pjatk.zaliczenie;

import pjatk.zaliczenie.model.Account;
import pjatk.zaliczenie.model.Bank;
import pjatk.zaliczenie.model.User;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(1,"Jan Kowalski", "56432467432123455643234564",52306);
        bank.addAccount(2, "Janusz Polski", "356735s34gdsa23", 1674332);
        bank.addAccount(3, "Piotr Bogaczewski", "256732", 256);
        System.out.println(bank.findAll());

        //Walidacja

        String myAccount = bank.findById(2).get().getAccountNumber();
        System.out.println(myAccount);

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<String>> isAccountNumValid = validator.validate(myAccount);
        System.out.println(isAccountNumValid);

    }
}
