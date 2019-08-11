# [0058. Length of Last Word](https://leetcode.com/problems/length-of-last-word/)

**Level: Easy**

## Description  

Given a string  _s_  consists of upper/lower-case alphabets and empty space characters  `' '`, return the length of last word in the string. 

If the last word does not exist, return 0. 

**Note:**  A word is defined as a character sequence consists of non-space characters only. 

### Example:

**Input:** "Hello World" 

**Output:** 5 

## Solutions

### First Try
``` js
/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s = s.trim();
    if (s.length == 0) {
        return 0;
    }
    sArray = s.split(' ');
    return sArray[sArray.length-1].length;
};
```