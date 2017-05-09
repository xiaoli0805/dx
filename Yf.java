package com.situ.day01;

import java.util.Scanner;

import org.junit.Test;

public class Yf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("非法的月份！");
			return;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 
				|| month == 8 || month == 10 || month == 12) {
			System.out.println(month + "月有31天");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "月有30天");
		} else {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println(month + "月有29天");
			} else {
				System.out.println(month + "月有28天");
			}
		}
	}
	
	
	
	//@Test
	public void switchTest() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
//		if (month < 1 || month > 12) {
//			System.out.println("非法的月份！");
//			return;
//		}
		switch (month) {  //fall-throw
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12:
			System.out.println(month + "月有31天");
			break;
		case 4: 
		case 6: 
		case 9: 
		case 11:
			System.out.println(month + "月有30天");
			break;
		case 2:
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println(month + "月有29天");
			} else {
				System.out.println(month + "月有28天");				
			}		
			break;
		default:
			System.out.println("非法的月份！");
			break;
		}
	}
	
	
	@Test
	public void Test() {
		int num1 = 3;
		int num2 = 5;
		int max = max(num1,num2);
		System.out.println("最大值 " + max);
	
		int num3 = 3;
		int num4 = 1;
		int max1 = max(num3,num4);
		System.out.println("最大值 " + max1);
	}
	
	public int max(int num1,int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
