package hw1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		// 檔案路徑
		String folderPath = "/Users/fanjingxin/data";
		String filePath = folderPath + "/Object.ser";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			boolean created = folder.mkdirs();
			if (created) {
				System.out.println("資料夾已建立：" + folderPath);
			} else {
				System.out.println("無法建立資料夾！");
				return;
			}
			
			// 建立物件
			Dog dog1 = new Dog("Buddy");
			Dog dog2 = new Dog("Charlie");
			Cat cat1 = new Cat("Luna");
			Cat cat2 = new Cat("Milo");
			
			//寫入物件到 Object.ser
			try (
				FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
				oos.writeObject(dog1);
				oos.writeObject(dog2);
				oos.writeObject(cat1);
				oos.writeObject(cat2);
				System.out.println("物件已成功寫入到" + filePath);
			} catch (IOException e) {
				System.out.println("寫入物件失敗：" + e.getMessage());
			}
		}
	}

}
