package com.situ.day01;

public class Text {
	public static void main(String[] args) {
		int year = 2017;
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("是闰年！");
		} else {
			System.out.println("不是闰年！");
		}
	}
	
	
	
}
