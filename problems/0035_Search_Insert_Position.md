# [0035. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

**Level: Easy**

## Description

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

### Example 1: 

**Input:** [1,3,5,6], 5 

**Output:** 2 

### Example 2: 

**Input:** [1,3,5,6], 2 

**Output:** 1 

### Example 3: 

**Input:** [1,3,5,6], 7 

**Output:** 4 

### Example 4: 

**Input:** [1,3,5,6], 0 

**Output:** 0 


## Solutions 

### First Try
``` js
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    if (nums.includes(target)) {
        return nums.indexOf(target);
    }
    if (nums[nums.length-1] < target) {
        return nums.length;
    }
    for (let i=0; i<nums.length; i++) {
        if (target > nums[i]) {
            continue;
        } else {
            return i;
        }
    }
};
```