package pjatk.zaliczenie.validators;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AccountNumberValidator implements ConstraintValidator<AccountNumber, String> {
    @Override
    public void initialize(AccountNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String num, ConstraintValidatorContext constraintValidatorContext) {
        if (num.length() != 26) {
            return false;
        }
        else {
            try {
                Integer number = Integer.parseInt(num);
            } catch (NumberFormatException numberFormatException) {
                return false;
            }
            return true;
        }
    }
}
