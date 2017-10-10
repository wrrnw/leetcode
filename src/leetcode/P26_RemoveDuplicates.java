package leetcode;
/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
It doesn't matter what you leave beyond the new length.
 */

public class P26_RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		boolean havePrevious = false;
		int newLength = 0;
		int prev;
		for(int i = 0; i < nums.length; i++) {
			if(!havePrevious) {
				prev = nums[i];
				havePrevious = true;
				newLength++;
			}
			if(havePrevious || prev == nums[i]) {
				continue;
			} else {
				nums[newLength++] = nums[i];
				prev = nums[i];
			}
		}
	return newLength;
	}
}
