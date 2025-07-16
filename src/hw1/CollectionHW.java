package hw1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionHW {
	public static void main(String args[]) {
		List<Object> list = new ArrayList<>();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(100);
		list.add(5.1);
		list.add("Kitty");
		list.add("Snoopy");
		list.add(100);
		list.add(new java.math.BigInteger("1000"));  // BigInteger
		list.add(new Object());    
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
		
//		Iterator objs = list.iterator();
//			while (objs.hasNext())
//				System.out.println(objs.next());
//		Collections.sort(list);// 反轉 Collections.reverse(list);
//
//
//		Object obj;
//		for (int i = 0; i < list.size(); i++) {
//			obj = list.get(i);
//			System.out.println(obj);
//		}
//		for (Object obj : list) {
//			System.out.println(obj + " -> 類型：" + obj.getClass().getSimpleName());
//		}
		Iterator<Object> iter = list.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			if(!(obj instanceof Number)) {
				iter.remove(); //移除不是Number的物件
			}
		}
		
		System.out.println("移除非Numer物件後：");
		for (Object obj : list) {
			System.out.println(obj + " -> 類型：" + obj.getClass().getSimpleName());
		}
		
		
		}
	}
