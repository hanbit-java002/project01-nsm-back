package kr.co.pensionpick.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.pensionpick.service.PensioninfoService;
import kr.co.pensionpick.service.ThemeovService;
import kr.co.pensionpick.service.ThemepvService;
import kr.co.pensionpick.service.ThemespaService;
import kr.co.pensionpick.service.ThemewsService;

@RestController
public class MainController {

	@Autowired
	private ThemeovService themeovService;
	@Autowired
	private ThemepvService themepvService;
	@Autowired
	private ThemespaService themespaService;
	@Autowired
	private ThemewsService themewsService;
	@Autowired
	private PensioninfoService pensioninfoService;
	
	@RequestMapping("/api2/sub/themeov")
	public List<Map<String, Object>> getThemeov() {
		return themeovService.getThemeov();
	}
	
	@RequestMapping("/api2/sub/themepv")
	public List<Map<String, Object>> getThemepv() {
		return themepvService.getThemepv();
	}
	
	@RequestMapping("/api2/sub/themespa")
	public List<Map<String, Object>> getThemespa() {
		return themespaService.getThemespa();	
	}
	
	@RequestMapping("api2/sub/themews")
	public List<Map<String, Object>> getThemews() {
		return themewsService.getThemews();
	}
	
	@RequestMapping("api2/sub/pensioninfo")
	public List<Map<String, Object>> getPensioninfo() {
		return pensioninfoService.getPensioninfo();
	}
}
