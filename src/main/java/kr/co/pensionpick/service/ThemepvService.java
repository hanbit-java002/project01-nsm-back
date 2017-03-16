package kr.co.pensionpick.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pensionpick.dao.ThemepvDAO;

@Service
public class ThemepvService {

	@Autowired
	private ThemepvDAO themepvDAO;
	
	public List<Map<String, Object>> getThemepv() {
		return themepvDAO.selectAll();
	}
}
