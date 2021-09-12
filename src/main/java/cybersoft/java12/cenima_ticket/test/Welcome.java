package cybersoft.java12.cenima_ticket.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {
	
	@GetMapping
	public Object WelcomeController() {
		return "welcome to booking cinema ticket online application ";
	}
	
}
