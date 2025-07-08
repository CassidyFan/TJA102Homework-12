package hw1;

import java.util.Scanner;

public class HomeWork0616_2 {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 10); // 產生 0~9 的亂數
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("開始猜數字吧！（請輸入 0~9）：");
			int guess = sc.nextInt();

			if (guess == number) {
				System.out.println("答對了！");
				break; // 猜對就跳出迴圈
			} else {
				System.out.println("猜錯囉！");
			}
		}
	}
}
