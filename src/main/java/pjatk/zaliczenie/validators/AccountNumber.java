package pjatk.zaliczenie.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AccountNumberValidator.class)
public @interface AccountNumber {
    String message() default "Invalid format of accountNumber";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
