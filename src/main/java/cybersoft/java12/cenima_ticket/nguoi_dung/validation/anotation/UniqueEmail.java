package cybersoft.java12.cenima_ticket.nguoi_dung.validation.anotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import cybersoft.java12.cenima_ticket.nguoi_dung.validation.validator.UniqueEmailValidator;
@Constraint(validatedBy = UniqueEmailValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface UniqueEmail {
	String message() default "email has been used";
	Class <?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}
