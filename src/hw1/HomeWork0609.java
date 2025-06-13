package hw1;

public class HomeWork0609 {
	
	public static void main(String[] args) {
		//計算1~1000的偶數和（2+4+6+8+...+1000）
		int sum = 0;
		for (int i = 2 ; i <= 1000 ; i += 2) {
			sum += i;
		}
		System.out.println( "偶數和是：" + sum);
		//計算1~10的連乘積（1*2*3*...*10）(用for迴圈)
		int sum1 = 1;
		for (int i = 1 ; i <= 10 ; i++) {
			sum1 *= i ;
		}
		System.out.println( "連乘積是：" + sum1);
		//計算1~10的連乘積（1*2*3*...*10）(用while迴圈)
		int sum2 = 1;
		int i = 1;
		while(i <= 10) {
			sum2 *= i;
			i++;
		}
		System.out.println("連乘積是：" + sum2);
		//請設計一隻Java程式，輸出結果為以下：
        //1 4 9 16 25 36 49 64 81 100
		for (int a = 1 ; a <= 10 ; a++) {
			int sum3 = a * a;
			System.out.print(sum3 + " ");
		}
	}
	
	
	

}
