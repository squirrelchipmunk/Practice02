package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2  = sc.nextInt();
		System.out.print("숫자3: ");
		int num3  = sc.nextInt();
		
		int min=num1;
		if(num2 < min) {
			min=num2;
		}
		if(num3 < min) {
			min=num3;
		}
		System.out.println("가장 작은수는 "+min+" 입니다.");
		
		sc.close();
	}
	
}
