package hw1;

public class Work03 {
	public int maxElement(int x[][]) {
		int max = x[0][0];
		for(int i = 1; i < x.length; i++) {
			for(int j = 1; j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	public double maxElement(double x[][]) {
		double max = x[0][0];
		for(int i = 1; i < x.length; i++) {
			for(int j = 1; j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		
		Work03 w = new Work03();
        System.out.println(w.maxElement(intArray)); 
        System.out.println(w.maxElement(doubleArray));
	}
}
