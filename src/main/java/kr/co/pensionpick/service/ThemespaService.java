package kr.co.pensionpick.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pensionpick.dao.ThemespaDAO;

@Service
public class ThemespaService {

	@Autowired
	private ThemespaDAO themespaDAO;
	
	public List<Map<String, Object>> getThemespa() {
		return themespaDAO.selectAll();
	}
}
