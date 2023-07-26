package com.example.mailtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import com.example.mailtest.util.MailService;

import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class MailServiceTest {
	
	@Resource(name = "mailService")
	private MailService mailService;



	@Test
	public void mailSendTest(){


		log.info("------------------------------");
		mailService.sendSimpleEmail();
		log.info("success......");
	}
}
