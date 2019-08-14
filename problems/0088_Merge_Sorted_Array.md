# [0088. Merge Sorted Array](https://leetcode.com/problems/merge_sorted_array/)

**Level: Easy**

## Description  

Given two sorted integer arrays  _nums1_  and  _nums2_, merge  _nums2_  into  _nums1_as one sorted array.

**Note:**

-   The number of elements initialized in  _nums1_  and  _nums2_  are  _m_  and  _n_respectively.
-   You may assume that  _nums1_  has enough space (size that is greater or equal to  _m_  +  _n_) to hold additional elements from  _nums2_.

### Example:

**Input:**
nums1 = [1,2,3,0,0,0], m = 3 
nums2 = [2,5,6],       n = 3 

**Output:** [1,2,2,3,5,6]


## Solutions

### First Try
``` js
/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
// Have no idea why this solution doesn't pass test case ([], 0, [1], 1)
var merge = function(nums1, m, nums2, n) {
    nums1.length = m; 
    nums2.length = n;
    if (nums1.length === 0) {
        nums1 = nums2;
    }
    if (nums2.length === 0) {
        return;
    }
    for (let i = 0; i < nums1.length; i++) {
        for (let j = 0; j < nums2.length; j++) {
            if (nums1[i] <= nums2[j]) {

                if(!nums1[i+1] || nums1[i+1] >= nums2[j]) {
                    nums1.splice(i+1, 0, nums2[j]);
                    nums2.shift();
                    continue;
                } else { // nums1[i+1] > nums2[j]
                    break;
                }    
            } else { // nums1[i] > nums2[j] 
                nums1.splice(i, 0, nums2[j]);
                nums2.shift();
            }
        }
    }
    return;
};
```