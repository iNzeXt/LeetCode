package leetcode.algorithms;

/**
 *  @problemNumber 633
 *  @source https://leetcode.com/problems/sum-of-square-numbers/
 *  @difficulty medium
 *  @author iNzeXt
 *  @date 31/08/2021
 */
public class SumOfSquareNumbers {

	/**
	 * Given a non-negative integer c, decide whether there're two integers a and b
	 * such that a2 + b2 = c.
	 * 
	 * Constraints: 0 <= c <= 2^31 - 1
	 * 
	 * Example: 
	 * 		Input: c = 5
	 * 		Output: true
	 * 		Explanation: 1 * 1 + 2 * 2 = 5
	 */
	public boolean judgeSquareSum(int c) {
		for (long a = 0; a * a <= c; a++) {
			
			double b = Math.sqrt(c - a * a);
			
			if (b == (int) b) {
				return true;
			}
		}
		return false;
	}

}
