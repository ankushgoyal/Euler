package Problem5;

import java.util.*;

import problem3.PrimeFactorization;
import utils.Product;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * 
 * @author agoyal
 *
 */
public class LeastCommonMultiple {
	
	private long findLCM(List<Long> nos) {
		
		PrimeFactorization pf = new PrimeFactorization();
				
		Map<Long, Integer> commonPrimes = new HashMap<Long, Integer>();
		
		for(long no : nos) {
			
			List<Long> primeFactors = pf.findPrimeFactors(no);
			Map<Long, Integer> count = countDuplicates(primeFactors);
			
			for(Long factor : count.keySet()) {
				if(commonPrimes.containsKey(factor) && commonPrimes.get(factor) < count.get(factor)) {
					commonPrimes.put(factor, count.get(factor));
				}
				else if(!commonPrimes.containsKey(factor)) {
					commonPrimes.put(factor, count.get(factor));
				}
			}
			
		}
		
		List<Long> allPrimes = new ArrayList<Long>();
		
		for(Long factor : commonPrimes.keySet()) {
			for(int i = 0; i < commonPrimes.get(factor); i++) {
				allPrimes.add(factor);
			}
		}
		
		System.out.println(allPrimes.toString());
		
		Product prod = new Product();
		
		return prod.findProd(allPrimes);
	}
	
	private Map<Long, Integer> countDuplicates(List<Long> primeFactors) {
		
		Map<Long, Integer> count = new HashMap<Long, Integer>();
		
		for(Long factor : primeFactors) {
			if(count.containsKey(factor)) {
				count.put(factor, count.get(factor)+1);
			}
			else {
				count.put(factor, 1);
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		LeastCommonMultiple lcm = new LeastCommonMultiple();
		
		List<Long> nos = new ArrayList<Long>();
		
		for(long i = 1; i <= 20; i++) {
			nos.add(i);
		}
		
		System.out.println(lcm.findLCM(nos));
	}

}
