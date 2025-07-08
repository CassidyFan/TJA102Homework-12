package hw1;

import java.util.Scanner;

public class HomeWork0616_3 {
	// 請設計一支程式，讓阿文可以輸入他不想要的數字(1~9)，
	// 畫面會顯示他可以選擇的號碼與總數（總共有35個數字可選
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("阿文請輸入你不想要的數字（1~9）：");
		int numberDont = sc.nextInt(); 

		int[] allNumbers = new int[49]; // 最多會有 49 個符合的號碼
		int index = 0; // 記錄目前陣列放到第幾格

		// 檢查每一個數字是否包含被排除的數字
		for (int i = 1; i <= 49; i++) {
			if (String.valueOf(i).contains(String.valueOf(numberDont))) {
				continue;
			}
			allNumbers[index] = i;
			index++;
		}

		// 輸出結果
		System.out.println("你可以選擇的號碼有：");
		for (int i = 0; i < index; i++) {
			System.out.print(allNumbers[i] + " ");
		}

		System.out.println("\n總共有 " + index + " 個號碼可以選。");
	}

}
