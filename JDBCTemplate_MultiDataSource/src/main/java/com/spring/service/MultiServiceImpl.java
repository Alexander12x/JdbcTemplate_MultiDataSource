package com.spring.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.MultiDao;

@Service
public class MultiServiceImpl implements MultiService {

	@Autowired
	private MultiDao dao;

	@Override
	public List<Map<String, Object>> executeQuery(String query) {
		return dao.execute(query);
	}

}
