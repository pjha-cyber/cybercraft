# Longest Substring Without Repeating Characters – Java 

This Java program calculates the **length of the longest substring without repeating characters** from a user-input string. It follows a custom logic using two string variables to track substrings dynamically.

## 🚀 Features

- Accepts user input via command line.
- Checks for invalid inputs (string length > 50,000).
- Tracks and updates the longest unique-character substring.
- Implements a basic character comparison algorithm without using advanced data structures.

---

## 🧠 How It Works

1. `helper` keeps track of the current substring without duplicates.
2. If a duplicate is found, `helper` is updated by slicing from the next character after the duplicate.
3. If `helper` becomes longer than `longs` (the longest substring so far), it's updated.
4. After scanning the string, the program returns the length of the longest unique-character substring.

---

## 🧪 Example

**Input:** abcabcbb

**Output:** Length of longest substring without duplicate characters: 3

---

## 🔍 Code Structure

- `lengthOfLongestSubstring(String s)` – Main logic to find the length.
- `main()` – Takes input and prints the result.

---



