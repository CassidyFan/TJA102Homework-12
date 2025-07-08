package hw1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadSample {
	
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/fanjingxin/Desktop/Sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		int charCount = 0; // 字元
		int lineCount = 0; // 行
		
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			charCount += str.length(); // 每一行的字元長度
			lineCount++;
		}
		
		long byteCount = file.length(); // 位元組數
		
		System.out.println("位元組數（bytes）:" + byteCount);
		System.out.println("字元數（characters）:" + charCount);
		System.out.println("位元組數（lines）:" + lineCount);
		
		br.close();
		fr.close();
	}
}
