package hw1;

public class HomeWork0605 {
	
	public static void main(String[] args) {
		//計算12、6的和與積？
		int num1 = 12;
		int num2 = 6;
		System.out.println(num1+num2);
		System.out.println(num1*num2);
		
		//計算200顆蛋共是幾打幾顆？（一打12顆)
		int dozen = 200/12;
		int others = 200%12;
		System.out.println(dozen + "打" + others + "顆");
		//更好的寫法
//	    System.out.printf("%d打%d顆", dozen, others);
		
		//算出256559秒為多少天、多少小時、多少分、多少秒？
		int num3 = 256559;
		int sec = num3%60;
		int min = (num3/60)%60;
		int hours = ((num3/60)/60)%24;
		int days = ((num3/60)/60)/24;
		System.out.printf("%d天%d小時%d分%d秒%n", days, hours, min, sec);
		
		//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		//圓面積＝半徑 * 半徑 * π
		//圓周長＝直徑 * π
		double pei = 3.1415;
		System.out.printf("圓面積 = %.3f%n" , 5*5*pei);
		System.out.printf("圓周長 = %.3f%n" , 5*2*pei);
		
		//某人在銀行存入150萬，銀行利率為2%，如果每天利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢(用複利計算)
		//複利公式 FV = PV * ( 1+利率 ) ^期數
	    int PV = 1500000;
	    double FV = PV * Math.pow((1+0.02), 10);
	    System.out.printf("本利和 = %.3f%n", FV);
	    
	    //請寫一支程式，利用System.out.println()印出以下三個運算式結果：
	    // 5+5 // 5+'5' // 5+"5" (並用註解各別說明答案產生的原因)
	    int num4 = 5;
	    System.out.println(num4+num4); //先宣告變數指定num4是整數5，再相加
	    System.out.println(num4+'5'); // '5' 是字元5的意思，不是數字的5，字元5是53
	    System.out.println(num4+"5"); //"5" 是String"5"的意思，是文字，沒有數字5的意思
	}
	
	
}
