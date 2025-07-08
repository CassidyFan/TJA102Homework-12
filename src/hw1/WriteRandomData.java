package hw1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteRandomData {
	public static void main(String[] args) throws IOException {
		// 設定亂數產生器
		Random rand = new Random();
		FileWriter fw = new FileWriter("Data.txt", true);
		
		fw.write("本次亂數：");
		for(int i = 0; i < 10; i++) {
			int num = rand.nextInt(1000) + 1;
			fw.write(num + (i < 9 ? "," : ""));
		}
		fw.write("\n");
		fw.close();
		
		System.out.println("亂數已寫入 Data.txt!");
	}
}
