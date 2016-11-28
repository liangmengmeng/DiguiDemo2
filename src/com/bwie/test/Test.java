package com.bwie.test;


public class Test {
	public static int a=0;
	public static void main(String[] args) {
		test();
		
	}
	private static void test() {
		a++;
		System.out.println("test"+a);
		if (a<3) {
			test();
		}else{
			System.out.println("µÝ¹é½áÊø");
		}
	}
	

}
