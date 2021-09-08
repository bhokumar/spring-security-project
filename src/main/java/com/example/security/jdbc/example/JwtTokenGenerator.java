package com.example.security.jdbc.example;

import com.example.security.jdbc.example.utils.JwtUtil;

public class JwtTokenGenerator {
	public static void main(String[] args) {
		String userName = "bhoopendra";
		JwtUtil jwtUtil = new JwtUtil();
		System.out.println(jwtUtil.generateToken(userName));
	}
}
