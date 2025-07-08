package hw1;

import java.util.Scanner;

public class HomeWork4_2 {
	public static void main(String[] args) {
		//阿文忘記帶錢包要借錢
		//輸入預借的金額後，要顯示哪些員工編號的同事可以借錢
		//並統計可借錢的總人數
		//「有錢可借的 員工編號: 25 19 27 共 3 人!」
		//提示：Scanner , 二維陣列
		
		//用兩個陣列列出員工編號及現金
		int[] empIds = {25, 32, 8, 19, 27};
		int[] cash = {2500, 800, 500, 1000, 1200};
		//使用Scanner讓使用者輸入想借的金額
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入預借的金額：");
		int want = sc.nextInt();
		//比對誰的現金>=（輸入金額）
		int count = 0;
		System.out.println("有錢可借的員工編號：");
		for (int i = 0; i < cash.length; i++) {
			if(cash[i] >= want) {
				System.out.print(empIds[i] + " ");
				count++;
			}
		}
		//print符合條件的員工和總人數
		System.out.println("共" + count + "人！");
		sc.close();//把Scanner關起來
	}
}
