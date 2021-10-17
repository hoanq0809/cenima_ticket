package cybersoft.java12.cenima_ticket.film.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cybersoft.java12.cenima_ticket.common.ResponseHandler;
import cybersoft.java12.cenima_ticket.film.dto.CreatePhimDto;
import cybersoft.java12.cenima_ticket.film.dto.PhimDto;
import cybersoft.java12.cenima_ticket.film.entity.Phim;
import cybersoft.java12.cenima_ticket.film.service.itf.PhimService;

@RestController
@RequestMapping("/api/QuanLyPhim")
public class PhimController {
	private PhimService service;
	public PhimController(PhimService phimService) {
		service = phimService;
	}
	
	private final String uploadDir = "/src/main/resources/static/";
	
	@PostMapping("/ThemPhim")
	public Object themPhim(@Valid @ModelAttribute CreatePhimDto dto, 
			@RequestParam("hinhAnh") MultipartFile hinhAnh, BindingResult errors ) {
		if( errors.hasErrors() ) 
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		String uploadAnh = uploadPicture(hinhAnh);
		Phim themPhim = service.themPhim(dto, uploadAnh);
		return ResponseHandler.getResponse(themPhim, HttpStatus.CREATED);
	}
	
	private String uploadPicture(MultipartFile hinhAnh) {
		try {
			//get file name
			String fileName = hinhAnh.getOriginalFilename();
			String userDerectory = Paths.get("").toAbsolutePath().toString();
			Path folderPath = Paths.get(userDerectory + uploadDir);
			if(!Files.exists(folderPath) ) 
				Files.createDirectories(folderPath);
			Path path = Paths.get(userDerectory + uploadDir + fileName);
			Files.write(path, hinhAnh.getBytes());
			return fileName;
		} catch (Exception e) {
			e.printStackTrace();
			return null ;
		}
	}

	@GetMapping("/LayDanhSachPhim")
	public Object layDanhSachPhim() {
		List<PhimDto> phims = service.findAll();
		
		return ResponseHandler.getResponse(phims, HttpStatus.OK);
	}
	
	@GetMapping("/LayDanhSachPhimTheoNgay")
	public Object LayDanhSachPhimTheoNgay(Date tuNgay, Date denNgay) {
		List<PhimDto> lsphim = service.findAllDate(tuNgay, denNgay);
		return ResponseHandler.getResponse(lsphim, HttpStatus.OK);
	}
	
}
