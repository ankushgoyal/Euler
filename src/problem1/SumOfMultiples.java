package problem1;

import java.util.*;

import utils.ArrayListOnSteroids;

public class SumOfMultiples {
	
	private int boundary;
	
	private List<Integer> multiplesOf = new ArrayList<Integer>(); 
	
	public static void main(String[] args) {
		
		SumOfMultiples som = new SumOfMultiples();
		
		som.boundary = args.length > 0 ? Integer.parseInt(args[0]) : 1000;
		
		som.multiplesOf = new ArrayListOnSteroids<Integer>().addItem(3).and(5);
		
		System.out.println("Sum: " + som.calculateSum());
		
	}
	
	private Integer calculateSum() {
		int sum = 0;
		
		for(int i = 1; i < boundary; i++) {
			for(int m : multiplesOf) {
				if(i % m == 0) {
					sum += i;
					break;
				}
			}
		}
		
		return sum;
	}

}
