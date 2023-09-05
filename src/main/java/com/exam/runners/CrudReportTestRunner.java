package com.exam.runners;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.exam.entity.Movie;
import com.exam.service.IMovieMgmtService;

@Component
public class CrudReportTestRunner implements CommandLineRunner {
	
	@Autowired
	private IMovieMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		
		
		try {
			//Invoking Service Method
			Movie mov = new Movie();
			
			mov.setMname("KARTHEEKEYA 2");
			mov.setYear("2022");
			mov.setRating(4.8f);
		//			System.out.println(com.exam.service.checkById(952));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}