package cybersoft.java12.cenima_ticket.common;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import cybersoft.java12.cenima_ticket.common.util.ErrorUtils;
import cybersoft.java12.cenima_ticket.film.entity.Phim;



public class ResponseHandler {

	public static Object getResponse(BindingResult errors, HttpStatus status) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", "");
		map.put("errors", ErrorUtils.getErrorMessages(errors));
		map.put("timestamp", LocalDateTime.now());
		map.put("status", status.value());
		
		return new ResponseEntity<Object>(map, status);
	}

	public static Object getResponse(Object content, HttpStatus status) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", content);
		map.put("errors", "");
		map.put("timestamp", LocalDateTime.now());
		map.put("status", status.value());
		
		return new ResponseEntity<Object>(map, status);
	}
	
	public static Object getResponse(HttpStatus status) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", "");
		map.put("errors", "");
		map.put("timestamp", LocalDateTime.now());
		map.put("status", status.value());
		
		return new ResponseEntity<Object>(map, status);
	}

}
