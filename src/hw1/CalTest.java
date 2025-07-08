package hw1;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		
		try {
			System.out.print("請輸入x的值：");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.print("請輸入y的值：");
			int y = Integer.parseInt(sc.nextLine());
			
			double result = c.powerXY(x, y);
			System.out.println(x + "的" + y + "次方等於" + (int)result);
			
		} catch (NumberFormatException e) {
			System.out.println("輸入格式不正確");
		} catch (CalException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
