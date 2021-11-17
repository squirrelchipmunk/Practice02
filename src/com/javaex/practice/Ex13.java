package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자: ");
		int x = sc.nextInt();
		
		
		double fx;
		if(x<=0) {
			fx=Math.pow(x, 3)-9*x+2;
		}
		else {
			fx=7*x+2;
		}
		System.out.println("계산 결과는 "+fx+" 입니다.");

		
		sc.close();
	}

}
