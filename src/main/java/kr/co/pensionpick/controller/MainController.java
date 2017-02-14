package kr.co.pensionpick.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.pensionpick.service.ThemeovService;

@RestController
public class MainController {

	@Autowired
	private ThemeovService themeovService;
	
	@RequestMapping("/api2/sub/themeov")
	public List<Map<String, Object>> getAll() {
		return themeovService.getAll();
	}
}
