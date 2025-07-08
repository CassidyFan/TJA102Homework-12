package hw1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		copyFile("/Users/fanjingxin/Desktop/Sample.txt", "/Users/fanjingxin/Desktop/Backup.txt");
	}
	
	public static void copyFile(String sourcePath, String destPath) {
		File sourceFile = new File(sourcePath);
		File destFile = new File(destPath);
		
		try (
			FileReader fr = new FileReader(sourceFile);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(destFile);
			BufferedWriter bw = new BufferedWriter(fw);
		){
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine(); // 換行
			}
			System.out.println("複製成功！");
		} catch (IOException e) {
			System.out.println("檔案複製時發生錯誤：" + e.getMessage());
		}
	}

}
