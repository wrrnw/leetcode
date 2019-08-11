# [0053. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

**Level: Easy**

## Description

Given an integer array  `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

### Example:

**Input:** [-2,1,-3,4,-1,2,1,-5,4], 

**Output:** 6 

**Explanation:** [4,-1,2,1] has the largest sum = 6. 

### Follow up:
If you have figured out the O(_n_) solution, try coding another solution using the divide and conquer approach, which is more subtle.

## Solutions

### First Try
``` js
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    if (nums.length == 0) {
        return 0;
    } 
    var maxSubstringStartPosition = 0;
    var maxSubstringEndPosition = 1;
    var maxSum = nums[0];
    for (let start = 0; start<nums.length; start++) {
        var currentSum = nums[start];
        maxSum = currentSum > maxSum ? currentSum : maxSum; 
        for (let end = start + 1; end<nums.length; end++) {
            currentSum += nums[end];
            maxSum = currentSum > maxSum ? currentSum : maxSum;    
        }
    }
    return maxSum;
};
```