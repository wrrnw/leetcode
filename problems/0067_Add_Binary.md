# [0067. Add Binary](https://leetcode.com/problems/add-binary/)

**Level: Easy**

## Description

Given two binary strings, return their sum (also a binary string).

The input strings are both  **non-empty**  and contains only characters  `1`  or `0`.

### Example 1:

**Input:** a = "11", b = "1" 

**Output:** "100" 

### Example 2:

**Input:** a = "1010", b = "1011" 

**Output:** "10101" 

## Solutions

### First Try
``` js
/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    if (a.length === 0 && b.length === 0) {
        return "";
    }
    if (a.length !== b.length) {
        a.length > b.length ? b = b.padStart(a.length, '0') : a = a.padStart(b.length, '0');
    }
    var output = '';
    var carry = 0;
    for (i = a.length-1; i >= 0; i--) {
        digitA = parseInt(a[i]);
        digitB = parseInt(b[i]);
        currentSum = digitA + digitB + carry;
        
        if (currentSum < 2) {
            output = currentSum.toString() + output;
            carry = 0;
        } else { // currentSum is equal to 2 or 3
            if (currentSum === 2) {
                output = '0' + output;
            } else  {
                output = '1' + output;
            }
            carry = 1;
            if (i == 0) {
                output = "1" + output;
            }
        }   
    }
    return output;       
};

// This method doesn't work for large number
// var sum = parseInt(a, 2) + parseInt(b, 2);
// return sum.toString(2);
```