package com.youtube.jwt.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    String message() default "Password Criteria Does Not Match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
