package com.eb.maasbordro.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eb.maasbordro.service.impl.PersonelServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	PersonelServiceImpl personelService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Boolean> login(@RequestParam String tcNo,@RequestParam String sifre){
		boolean isExist = personelService.checkLogin(tcNo, sifre);
		Map<String, Boolean> response = new HashMap<>();
		if(isExist) {
			response.put("login successful", Boolean.TRUE);
		}
		else {
			response.put("login is not successful", Boolean.FALSE);
		}
		return response;
		
	}
	
}
