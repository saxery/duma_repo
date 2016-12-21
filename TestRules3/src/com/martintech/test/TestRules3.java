package com.martintech.test;

public class TestRules3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = 8289;
		TestRules3.test(s);

	}
	
	public static void test(short s) {
		System.out.println(s);
		byte[] k = new byte[2];
		k[0] = (byte)(s << 8);
		System.out.println(s);
		System.out.println(k[0]);
	}

}
