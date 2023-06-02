package com.ssafy.demo;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {


	@Value("${jasypt.encryptor.password}")
	private String PASSWORD;


	@Test
	void contextLoads() {
	}

	@Test
	void jasypt() {
		// 암호화할 데이터
		String password = "password";

		// 넣고
		String encryptPassword = jasyptEncrypt(password);

		// 출력해서 보기
		System.out.println("encryptPassword" + encryptPassword);
	}

	public String jasyptEncrypt(String input) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		encryptor.setPassword(PASSWORD);
		return encryptor.encrypt(input);
	}

	public String jasyptDecryt(String input){
		System.out.println(PASSWORD);
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		encryptor.setPassword(PASSWORD);
		return encryptor.decrypt(input);
	}

}
