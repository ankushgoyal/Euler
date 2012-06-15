package utils;

import java.util.*;

public class Product {
	
	public long findProd(Collection<Long> nos) {
		long prod = 1;
		
		for(Long no : nos) {
			prod *= no;
		}
		
		return prod;
	}

}
