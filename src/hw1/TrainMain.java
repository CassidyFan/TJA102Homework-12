package hw1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TrainMain {
	public static void main(String[] args) {
		List<Train> trainList = List.of(
				new Train(202, "普悠瑪", "樹林", "花蓮", 400),
				new Train(1254, "區間", "屏東", "基隆", 700),
				new Train(118, "自強", "高雄", "台北", 500),
				new Train(1288, "區間", "新竹", "基隆", 400),
				new Train(122, "自強", "台中", "花蓮", 600),
				new Train(1222, "區間", "樹林", "七堵", 300),
				new Train(1254, "區間", "屏東", "基隆", 700)
		);
		
		// 用 HashSet 移除重複物件
		Set<Train> trainSet = new HashSet<>(trainList);
		// 用 Iterator 取出不重複的物件
		System.out.println("不重複的 Train 物件：");
		Iterator<Train> it = trainSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//用 for-each 印出由大到小排序
		System.out.println("\nTrain 物件 : 班次由大到小排序：");
		List<Train> sortedList = new ArrayList<>(trainList);
		sortedList.sort((a, b) -> Integer.compare(b.getNumber(), a.getNumber()));
		
		for(Train train : sortedList) {
			System.out.println(train);
		}
		// 用 for迴圈 印出由大到小排序
		System.out.println("\nTrain 物件：班次由小到大 & 不重複：");
		Set<Train> uniqueTrainSet = new HashSet<>(trainList);
		List<Train> sortedUniqueList = new ArrayList<>(uniqueTrainSet);
		sortedUniqueList.sort((a, b) -> b.getNumber() - a.getNumber());//由大到小
		
		for (int i = 0; i < sortedUniqueList.size(); i++) {
			System.out.println(sortedUniqueList.get(i));
		}

	} 

}
