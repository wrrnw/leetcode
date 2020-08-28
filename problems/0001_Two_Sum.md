# [0001. Two Sum](https://leetcode.com/problems/two-sum/)

**Level: Easy**

## Description  
Given an array of integers *nums* and and integer *target*, return the indices of the two numbers such that they add up to *target*. <br />

You may assume that each input would have **exactly one solution**, and you may not use the same element twice. <br />

You can return the answer in any order.

### Example 1:  
> Input: nums = [2,7,11,15], target = 9 <br />
Output: [0,1] <br />
Output: Because nums[0] + nums[1] == 9, we return [0, 1]

### Example 2: 
> Input: nums = [3,2,4], target = 6 <br />
Output: [1,2]

### Example 3:
> Input: nums = [3,3], target = 6 <br />
Output: [0,1]

### Constraints:
* 1 <= nums.length <= 10^5
* -10^9 <= nums[i] <= 10^9
* -10^9 <= target <= 10^9
* Only one valid answer exists.


## Solutions

### First Try
``` js
/**
 * @param  {number[]}  nums
 * @param  {number}  target
 * @return  {number[]}
 */
var twoSum = function(nums, target) {
	var result = [];
	for (var i=0; i<nums.length-1; i++) {
		for (var j=i+1; j<nums.length; j++) {
			if(nums[i] + nums[j] === target) {
				return [i, j];
			}
		}
	}
};
```

### Second Try
``` js
/**
 * @param  {number[]}  nums
 * @param  {number}  target
 * @return  {number[]}
 */
var twoSum = function(nums, target) {
  let dict = {};
  for (let i = 0; i < nums.length; i++) {
    if (Object.keys(dict).includes(String(nums[i]))) {
      return [dict[nums[i]], i];
    }
    let remain = target - nums[i];
    dict[remain] = i;
  }
};
```