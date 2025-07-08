package hw1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
public static void main(String[] args) {
	String filePath = "/Users/fanjingxin/data/Object.ser";
	try(
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
	){
		// 每次讀出一個 Speakable 物件並且呼叫 speak()
		for (int i = 0; i < 4; i++) {
			Object obj = ois.readObject();
			
			if(obj instanceof Speakable) {
				Speakable s = (Speakable) obj;
				s.speak();
			}else {
				System.out.println("不是可以說話的物件：" + obj.getClass());
			}
		}
	} catch (IOException | ClassNotFoundException e) {
		System.out.println("讀取物件失敗：" + e.getMessage());
	}
	
}
}
