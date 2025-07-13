# Two Sum - Java Implementation

This is a basic Java implementation of the **Two Sum** problem, a common coding challenge in interviews and programming platforms like LeetCode.

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the **two numbers** such that they add up to `target`.

**Constraints:**

* You may assume each input has exactly **one solution**.
* You **may not** use the same element twice.
* The solution can be returned in **any order**.

## Input Format

* The program takes the length of the array as input.
* Then it takes `n` integers as array elements.
* Then it takes one integer as the `target`.

## Example

**Input:**

```
Enter length of the array: 4  
Enter 4 values for the array:  
2 7 11 15  
Enter the target number: 9  
```

**Output:**

```
Output: [0,1]
```

## Code Overview

### `Solution` class:

Contains the `twoSum` method that:

* Validates array size and number ranges.
* Uses a **nested loop** to check every pair of elements.
* Returns indices if a pair adds up to the target.

### `TwoSum` class:

Handles input/output and calls the solution method.

## Time Complexity

* **Worst Case:** O(n²)
  (due to the nested loop checking every pair of elements)

* **Best Case:** O(1)
  (if the answer is found early in the loop)

## Sample Code Snippet

```java
for(int i = 0; i < nums.length; i++) {
    for(int j = i + 1; j < nums.length; j++) {
        if(nums[i] + nums[j] == target) {
            return new int[]{i, j};
        }
    }
}
```

## Future Improvement

This problem can be optimized using **HashMaps**, which reduce time complexity to O(n). However:

> **Note:** I don't know HashMap yet. I'll do this again someday when I know that.


