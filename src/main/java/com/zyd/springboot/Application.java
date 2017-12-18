package com.zyd.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zyd.springboot.mapper.CountryMapper;

/**
 * 
 * Spring Boot启动类
 *
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private CountryMapper countryMapper;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		countryMapper.selectAll();
	}
}
