package hw1;

import java.util.Scanner;

public class HomeWork0616 {
	public static void main(String[] args) {
		//請設計一支程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其他三角形或不是三角形
		//提示：Scanner，三角形成立條件，if else
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入三個數字：");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		//三角形的判斷條件：(任兩邊之和大於第三邊)
		if(a + b > c && a + c > b && b + c > a) {
			if(a == b && b == c) {
				System.out.println("正三角形");
			} else if (a == b || a == c || b == c) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("不是三角形");
			}
		}
	}

}
