package hw1;

public class starSquare {
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) { // 高 外側
			for(int j = 0; j < width; j++) { // 寬 內側
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
