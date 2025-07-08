package hw1;

import java.util.Random;

public class RandomAvg {
	
	public static void main(String[] args) {
        randAvg();
    }
	
	public static void randAvg() {
		Random rand = new Random();
		int[] nums = new int[10];
		int sum = 0;
		
		System.out.println("本次亂數結果：");
		
		for(int i = 0;i < nums.length; i++) {
			nums[i] = rand.nextInt(101);
			System.out.print(nums[i] + " ");
			sum += nums[i];
		}
		
		double avg = sum / 10.0;
		System.out.println();
		System.out.println("平均值：" + avg);
	}
}
