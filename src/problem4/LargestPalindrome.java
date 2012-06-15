package problem4;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @author agoyal
 *
 */
public class LargestPalindrome {
	
	private int findLargestPal(int start, int finish) {
		int candidate = 0;
		
		for(int x = start; x > finish; x--) {
			for(int y = start; y > finish; y--) {
				int prod = x*y;
				if(prod > candidate && isPalindrome(prod)) {
					candidate = prod;
				}
			}
		}
		
		return candidate;
	}
	
	private boolean isPalindrome(int candidate) {
		boolean isPal = false;
		
		String candidateStr = String.valueOf(candidate);
		
		StringBuffer reverse = new StringBuffer();
		
		char[] charArr = candidateStr.toCharArray();
		
		for(int i = charArr.length-1; i >=0; i--) {
			reverse.append(charArr[i]);
		}
		
		if(candidateStr.contentEquals(reverse.toString())) {
			return true;
		}
		
		return isPal;
	}
	
	public static void main(String[] args) {
		LargestPalindrome lp = new LargestPalindrome();
		
		System.out.println(lp.findLargestPal(999, 99));
		
	}
	
}
