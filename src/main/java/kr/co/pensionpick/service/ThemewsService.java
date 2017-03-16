package kr.co.pensionpick.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pensionpick.dao.ThemewsDAO;

@Service
public class ThemewsService {

	@Autowired
	private ThemewsDAO themewsDAO;
	
	public List<Map<String, Object>> getThemews() {
		return themewsDAO.selectAll();
	}
}
