package hw1;

import java.util.Random;

public class Work04 {
	public String genAuthCode() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder code = new StringBuilder();
		Random rand = new Random();
		
		for(int i = 0; i < 8; i++) {
			int index = rand.nextInt(chars.length());
			code.append(chars.charAt(index));
		}
		
		return code.toString();
	}
	
	public static void main(String[] args) {
		Work04 w = new Work04();
		System.out.println("本次隨機產生驗證碼為：" + w.genAuthCode());
	}

}
