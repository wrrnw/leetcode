# [0070. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

**Level: Easy**

## Description  

You are climbing a stair case. It takes  _n_  steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

**Note:**  Given  _n_  will be a positive integer.

### Example 1:

**Input:** 2 

**Output:** 2 

**Explanation:** There are two ways to climb to the top. 
1. 1 step + 1 step 
2. 2 steps 

### Example 2:

**Input:** 3 

**Output:** 3 

**Explanation:** There are three ways to climb to the top. 
1. 1 step + 1 step + 1 step 
2. 1 step + 2 steps 
3. 2 steps + 1 step 

## Solutions

### First Try
``` js
/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if (n < 3) {
        var output = n;
    }
    
    // Get started when n = 3
    var previous = 1, current = 2;
    for (let i = 3; i <= n; i++) {
        output = previous + current;
        previous = current;
        current = output;
    }
    return output;
};
    // Time Limit Exceeded
    // if (n < 3) {
    //     return n;
    // }
    // else {
    //     return climbStairs(n-1) + climbStairs(n-2);
    // }
```