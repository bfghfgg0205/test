package com.example.services.impl;

import org.springframework.stereotype.Service;

import com.example.services.TranslateService;

@Service
public class TranslateServiceImpl implements TranslateService{

	@Override
	public String convertLocale(String param) {
		return "1".equals(param) ? "Japan" : "English";
	}

}
