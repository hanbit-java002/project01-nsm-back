package kr.co.pensionpick.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pensionpick.dao.PensioninfoDAO;

@Service
public class PensioninfoService {

	@Autowired
	private PensioninfoDAO pensioninfoDAO;
	
	public List<Map<String, Object>> getPensioninfo() {
		return pensioninfoDAO.pensionInfo();
	}
}
