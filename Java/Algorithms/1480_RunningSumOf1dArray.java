package leetcode.algorithms;

/**
 *  @problemNumber 1480
 *  @source https://leetcode.com/problems/running-sum-of-1d-array/
 *  @difficulty easy
 *  @author iNzeXt
 *  @date 31/08/2021 
 */
public class RunningSumOf1dArray {

	/**
    	 *  Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]�nums[i]).
     	 * 
	 *  Return the running sum of nums.
	 *  
	 *  Example:
	 *  	Input: nums = [1,2,3,4]
	 *		Output: [1,3,6,10]
	 * 		Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
	 *  
	 *  Constraints:
	 *		1 <= nums.length <= 1000
	 *		-10^6 <= nums[i] <= 10^6
     */
    public int[] runningSum(int[] nums) {
    	
    	for( int i = 1; i < nums.length; i++ ) {
    		nums[i] += nums[i - 1];
    	}
    	
    	return nums;
    	
    }
    
	
}
