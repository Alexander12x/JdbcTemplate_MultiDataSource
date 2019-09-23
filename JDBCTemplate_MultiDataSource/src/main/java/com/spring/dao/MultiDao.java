package com.spring.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MultiDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> execute(String query) {
		return jdbcTemplate.queryForList(query);
	}
}
