package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char apb = sc.nextLine().charAt(0);
		
		switch(apb) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("모음 입니다.");
				break;
			default:
				System.out.println("자음 입니다.");
		}

		
		sc.close();
	}

}
