# [0020. Valid Parantheses](https://leetcode.com/problems/valid-parantheses/)

**Level: Easy**

## Description

Given a string containing just the characters  `'('`,  `')'`,  `'{'`,  `'}'`,  `'['`  and  `']'`, determine if the input string is valid.

An input string is valid if:

1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

**Example 1:** 

**Input:** "()" 

**Output:** true 

**Example 2:** 

**Input:** "()[]{}" 

**Output:** true 

**Example 3:** 

**Input:** "(]" 

**Output:** false 

**Example 4:** 

**Input:** "([)]" 

**Output:** false 

**Example 5:** 

**Input:** "{[]}" 

**Output:** true 


## Solutions

### First Try
``` js
/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    if (s.length % 2 !== 0) {
        return false;
    }
    var openBrackets = ["(", "[", "{"];
    var closeBrackets = {
        "(": ")",
        "[": "]",
        "{": "}"
    }
    var stack = [];
    for (let i=0; i < s.length; i++) {
        if (openBrackets.includes(s[i])) {
            stack.push(s[i]);
        } else if (s[i] !== closeBrackets[stack[stack.length-1]] || stack.length === 0 ) {
            return false;
        } else {
            stack.pop();
        }
    }
    if (stack.length) {
        return false;
    }
    return true;
};
```