package kr.co.pensionpick.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pensionpick.dao.ThemeovDAO;

@Service
public class ThemeovService {

	@Autowired
	private ThemeovDAO themeovDAO;
	
	public List<Map<String, Object>> getAll() {
		return themeovDAO.selectAll();
	}
}
