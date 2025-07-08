package hw1;

public class HomeWork4_1 {
	public static void main(String[] args) {
		// 有個一維陣列如下:
		// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		// (提示:陣列，length屬性)
		
		int[] nums = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		
		int sum = 0;
		for (int i = 1; i < nums.length; i++) {
			sum += nums[i];
		}
		
		double avg = (double) sum / nums.length;
		System.out.println("平均值是:" + avg);
		
		System.out.println("大於平均值的元素有：");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > avg) {
				System.out.println(+nums[i]);
			}
		}
		
		//請建立一個字串，經過程式執行後，輸入結果是反過來的
		//例如String s = “Hello World”，執行結果即為dlroW olleH(char)
		//(提示:String方法，陣列)
		//字串轉字元
		String s = "Hello World";
		char[] chars = s.toCharArray();
		
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
		
		System.out.println(); //想換行
		
        //有個字串陣列如下 (八大行星):
        //{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
        //請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
        //(提示:字元比對，String方法)
		String[] planets = {
				"mercury", "venus",
				"earth", "mars",
				"jupiter", "saturn",
				"uranus", "neptune"
		};
		
		int count = 0;
		for (int i = 0; i < planets.length; i++) {
			String word = planets[i];//先把每一個字串拿出來
			for(int j = 0; j < word.length(); j++) {
				char c = word.charAt(j);//再轉成字元.chatAt()和toCharArray()都可以
				//判斷是否為母音
				if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++; //是的話就++
				}
			}
		}
		System.out.println( "母音總共有：" + count + "個");
	}
}
