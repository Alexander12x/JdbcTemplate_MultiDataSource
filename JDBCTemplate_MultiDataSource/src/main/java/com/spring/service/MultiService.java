package com.spring.service;

import java.util.List;
import java.util.Map;

public interface MultiService {
	
	 List<Map<String,Object>> executeQuery(String query);

}
