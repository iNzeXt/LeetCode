package leetcode.algorithms;

/**
 *  @problemNumber 1929
 *  @source https://leetcode.com/problems/concatenation-of-array/
 *  @difficulty easy
 *  @author iNzeXt
 *  @date 31/08/2021
 */
public class ConcatenationOfArray {

	/**
	 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] 
	 * and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     *
	 * Specifically, ans is the concatenation of two nums arrays.
	 *
	 * Return the array ans
	 * 
	 */
	public int[] getConcatenation(int[] nums) {
        
		 int[] ans = new int[nums.length*2];
		 
		 for(int i = 0; i < nums.length; i++) {
			 ans[i] = nums[i];
			 ans[nums.length + i] = nums[i];
		 }
 		 
		 return ans;
    }
	
}
