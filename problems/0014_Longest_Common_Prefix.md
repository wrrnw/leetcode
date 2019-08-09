# [0014. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

**Level: Easy**

## Description
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string  `""`.

**Example 1:**

**Input:** ["flower","flow","flight"] 
**Output:** "fl" 

**Example 2:**

**Input:** ["dog","racecar","car"] 
**Output:** "" 
**Explanation:** There is no common prefix among the input strings. 

**Note:** 
All given inputs are in lowercase letters  `a-z`.

## Solutions

### First Try
``` js
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    var commomPrefix = "";
    if (strs.length === 0) {
        return commomPrefix;
    }
    strs.sort(compareStringLength);
    var sampleString = strs[0];
    var maxCommonLength = sampleString.length;
    for (let i = 1; i < strs.length; i++) {
        let minStringLength = Math.min(maxCommonLength, strs[i].length);
        var characterCount = 0;
        for (let j = 0; j < minStringLength; j++) {
            if (sampleString[j] == strs[i][j]) {
                characterCount++;
                if (characterCount >= maxCommonLength) {
                    break;
                }
            } else {
                maxCommonLength = characterCount;
                break;
            }
        }
    }
    commonPrefix = sampleString.slice(0, maxCommonLength);
    return commonPrefix;
};

const compareStringLength = (str1, str2) => {
    if (str1.length < str2.length) {
        return -1;
    } else if (str1.length > str2.length) {
        return 1;
    } else {
        return 0;
    }
}
```