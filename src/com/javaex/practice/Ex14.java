package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해주세요.");
		System.out.print("금익: ");
		int profit = sc.nextInt();

		double incomeTax=0;
		
		if(profit<0) {
			System.out.println("잘못입력했습니다.");
			System.exit(0);
		}
		//		0.09*수익
		if(profit>=0 && profit<=1000) {
			incomeTax = 0.09*profit;
		}
		//		1000*0.09 + 0.18*(수익-1000)
		else if(profit<=4000){
			incomeTax = 1000*0.09 + 0.18*(profit-1000);
		}
		//		1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
		else if(profit<8000) {
			incomeTax = 1000*0.09 + 3000*0.18 + 0.27*(profit-4000);
		}
		//		1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		else{
			incomeTax = 1000*0.09 + 3000*0.18 + 4000*0.27+ 0.36*(profit-8000);
		}
		System.out.println("소득세는 "+incomeTax+" 입니다.");

		
		sc.close();
	}

}