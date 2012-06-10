package problem2;

import java.util.*;

public class FiboEvenSum {
	
	private int evenSum = 0;
	
	private int calcFiboEvenSum(int bound) {
		List<Integer> fibList = new ArrayList<Integer>();
		fibList.add(1);
		fibList.add(1);
		
		while(fibList.get(fibList.size()-1) < bound) {
			int sumOfLast2Nos = fibList.get(fibList.size()-2) + fibList.get(fibList.size()-1);
			if(sumOfLast2Nos > bound) {
				break;
			}
			fibList.add(sumOfLast2Nos);
			if(sumOfLast2Nos % 2 == 0) {
				evenSum += sumOfLast2Nos;
			}
		}
		
		return evenSum;
	}
	
	public static void main(String[] args) {
		FiboEvenSum fes = new FiboEvenSum();
		
		System.out.println("Answer: " + fes.calcFiboEvenSum(4000000));
	}

}
