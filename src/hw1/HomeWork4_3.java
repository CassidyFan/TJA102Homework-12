package hw1;

import java.util.Scanner;
//import java.util.Scanner;（command + shift + o)

public class HomeWork4_3 {
	public static void main(String[] args) {
		//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
        //例:輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
        //(提示1:Scanner，陣列)
        //(提示2:需將閏年條件加入) (提示3:擋下錯誤輸入:例如月份輸入為2，則日期不該超過29)
		
		//使用 Scanner 讓使用者輸入年、月、日。
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入西元年份：");
		int year = sc.nextInt();
		System.out.println("請輸入月份(1~12)：");
		int month = sc.nextInt();
		System.out.println("請輸入日期：");
		int day = sc.nextInt();
		//判斷是否為閏年，再決定每個月的天數。
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		//使用陣列加總前幾個月的天數，再加上當月的日數。
		int[] daysInMonth = {
				31,//1月
				isLeap ? 29 : 28,//2月
				31, 30, 31, 30,//3月~6月
				31, 31, 30, 31, 30, 31//7月~12月
		};
		//並且防呆（像 2 月不能超過 28 或 29 天）。
        if (month < 1 || month > 12) {
            System.out.println("月份輸入錯誤！");
            return;
        }

        if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("日期輸入錯誤！");
            return;
        }

        //計算該日為當年第幾天
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;

        //輸出
        System.out.println("輸入的日期為該年第 " + totalDays + " 天");

        sc.close();
	}
}
