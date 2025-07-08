package hw1;

import java.util.Scanner;

public class HomeWork5_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入寬與高：");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		starSquare sq = new starSquare();//建立物件
		sq.starSquare(width, height);//呼叫方法印星星矩形
	}
}
