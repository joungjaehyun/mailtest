package com.example.mailtest.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service("mailService")
public class MailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendSimpleEmail(){
		SimpleMailMessage simpleMessage = new SimpleMailMessage();
		simpleMessage.setSubject("test~~~~");
		simpleMessage.setTo("krige@naver.com");
		simpleMessage.setText("test입니다.");

		javaMailSender.send(simpleMessage);
	}
}
