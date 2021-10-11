package cybersoft.java12.cenima_ticket.nguoi_dung.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cybersoft.java12.cenima_ticket.common.util.ValidatorUtils;
import cybersoft.java12.cenima_ticket.nguoi_dung.service.itf.UserService;
import cybersoft.java12.cenima_ticket.nguoi_dung.validation.anotation.UniqueEmail;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
	private String message;
	private UserService service;
	
	public UniqueEmailValidator(UserService userService) {
		// TODO Auto-generated constructor stub
		service=userService;
	}
	@Override
	public void initialize(UniqueEmail uniqueEmail) {
		// TODO Auto-generated method stub
		message=uniqueEmail.message();
	}
	

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(email==null)
		return false;
		boolean isTaken=service.isTakenEmail(email);
		if(!isTaken)
			return true;
		ValidatorUtils.addError(context, message);
		return false;
	}
	

}
