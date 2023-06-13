package telran.util.tests;

import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return getEvenOdd(o1)-getEvenOdd(o2);
	}

	private int getEvenOdd(Integer num) {
		return num % 2 == 0 ? 0 : 1;
	}
}
//
//		if(o1 % 2 == 0 && o1 > o2 || o1 % 2 != 0 && o1 < o2) {
//			return  1 ;
//		}else if(o1 % 2 == 0 && o1 < o2 || o1 % 2 != 0 && o1 > o2) {
//			return -1;
//		}else 
//			return 0;
//		}