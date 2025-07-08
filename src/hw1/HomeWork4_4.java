package hw1;

public class HomeWork4_4 {
	public static void main(String args[]) {
		//有 8位同學（8 欄）
        //每位同學考了 6次考試（6 列）
        //找出每個同學在 6 次考試中的最高分。
		
		//宣告一個 int[][] 二維陣列。
		int[][] scores = {
	            {10, 35, 40, 100, 90, 85, 75, 70},
	            {37, 75, 77, 89, 64, 75, 70, 95},
	            {100, 70, 79, 90, 75, 70, 79, 90},
	            {77, 95, 70, 89, 60, 75, 85, 89},
	            {98, 70, 89, 90, 75, 90, 89, 90},
	            {90, 80, 100, 75, 50, 20, 99, 75}
	        };
		//外層跑「每個學生（欄）」共 8 次。
		for (int student = 0; student < 8; student++) {
            int max = scores[0][student]; 
            //先設第一筆成績為最大值
            //因為需要初始值，所以先假設這個學生第一次考試的成績是最高的，
            //然後再去比較後面5次考試是否有更高的。
		//內層跑「每次考試（列）」共 6 次。
            for (int exam = 1; exam < 6; exam++) {
                //每次比較是否比目前的最大值還大。
            	if (scores[exam][student] > max) {
                    max = scores[exam][student];
                }
            }
        //最後輸出該學生的最高分。
            System.out.println((student + 1) + "號同學最高分是：" + max);
		
		}	
	}
}
