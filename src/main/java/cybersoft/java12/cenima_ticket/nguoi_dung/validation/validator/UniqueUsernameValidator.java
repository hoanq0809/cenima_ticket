package cybersoft.java12.cenima_ticket.nguoi_dung.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cybersoft.java12.cenima_ticket.common.util.ValidatorUtils;
import cybersoft.java12.cenima_ticket.nguoi_dung.service.itf.UserService;
import cybersoft.java12.cenima_ticket.nguoi_dung.validation.anotation.UniqueUsername;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String>  {
	
	
	private String message;
	private UserService service;
	public UniqueUsernameValidator(UserService userService) {
		// TODO Auto-generated constructor stub
		service=userService;
	}
	@Override
	public boolean isValid(String taiKhoan, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		if(taiKhoan==null)
			return false;
		boolean isTaken=service.isTakenUsername(taiKhoan);
		if(!isTaken)
			return true;
		ValidatorUtils.addError(context, message);
			return false;
	}

	@Override
	public void initialize(UniqueUsername uniqueUsername) {
		// TODO Auto-generated method stub
		this.message=uniqueUsername.message();
	}
	
	

}
