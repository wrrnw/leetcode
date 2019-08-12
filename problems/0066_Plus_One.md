# [0066. Plus One](https://leetcode.com/problems/plus-one/)

**Level: Easy**

## Description

Given a  **non-empty**  array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

### Example 1:

**Input:** [1,2,3] 

**Output:** [1,2,4] 

**Explanation:** The array represents the integer 123. 

### Example 2:

**Input:** [4,3,2,1] 

**Output:** [4,3,2,2] 

**Explanation:** The array represents the integer 4321. 

## Solutions

### First Try
``` js
/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    if (digits.length === 0) {
        return [];
    }
    for (let i = digits.length-1; i >= 0; i--) {
        if (EqualToTen(digits[i])) {
            digits[i] = 0;
            if (i === 0) {
                digits.unshift(1);
                break;
            }
            continue;
        } else {
            digits[i] += 1;
            break;
        }
    }
    return digits;
};

var EqualToTen = (digit) => {
    if (digit + 1 === 10) {
        return true;
    } else {
        return false;
    }
};
    
// Cannot use this approach since cannot deal with number greater than Number.MAX_SAFE_INTEGER, which is Math.pow(2, 53) - 1, 9007199254740991.

    // const numberOfDigits = digits.length;
    // var currentDigit = numberOfDigits - 1;
    // var sum = 0;
    // for (let i = 0; i < numberOfDigits; i++) {
    //     sum += digits[i] * Math.pow(10, currentDigit--);
    // }
    // sum += 1;
    // return sum.toString().split("");
// };
```