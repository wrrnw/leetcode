# [0069. Sqrt(x)](https://leetcode.com/problems/sqrtx/)

**Level: Easy**

## Description  

Implement  `int sqrt(int x)`.

Compute and return the square root of  _x_, where _x_ is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

### Example 1:

**Input:** 4 

**Output:** 2 

### Example 2:

**Input:** 8 

**Output:** 2 

**Explanation:** The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned. 

## Solutions

### First Try
``` js
/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    if (x < 2) {
        return x;
    }
    for (var i = 0; i < x; i++) {
        if ((i * i <= x) && ((i+1) * (i+1) > x)) {
            return i;
        } 
    }
};
```