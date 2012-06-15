package problem3;

import java.util.*;

public class PrimeFactorization {
	
	public List<Long> findPrimeFactors(Long no) {
		List<Long> factors = new ArrayList<Long>();
		
		for(long i = 2; i <= no; i++) {
			if(!isPrime(i)) {
				continue;
			}
			
			while(no % i == 0) {
				factors.add(i);
				no /= i;
			}
		}
		
		if(factors.size() == 0) {//must be prime
			factors.add(no);
		}
		
		return factors;
	}
	
	private boolean isPrime(Long no) {
		if(no == 2) {
			return true;
		}
		
		if(no % 2 == 0) {
			return false;
		}
		
		boolean isPrime = true;
		
		for(long i = 3; i*i <= no; i+=2) {
			if(no % i == 0) {
				return false;
			}
		}
		
		return isPrime;
		
	}
	
	public static void main(String[] args) {
		PrimeFactorization pf = new PrimeFactorization();
		List<Long> factors = pf.findPrimeFactors(Long.parseLong("600851475143"));
		System.out.println(factors.toString());
	}

}
