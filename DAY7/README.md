# First Non-Repeating Character Problem

## 📜 Description
Given a string, find the **first non-repeating character** in it. If all characters repeat, return `-1`.

A non-repeating character is the first character that occurs only once in the string.

---

## 📝 Problem Statement
**Input:**  
A string (may contain repeated characters).

**Output:**  
- The first non-repeating character.  
- If no such character exists, return `-1`.

---

## 💡 Example

**Example 1:**  
**Input:**
```text
"swiss"
```
**Output:**
```text
w
```
**Explanation:**
- `s` repeats
- `w` occurs once → first non-repeating

**Example 2:**  
**Input:**
```text
"aabbcc"
```
**Output:**
```text
-1
```
**Explanation:**
All characters repeat, so output is `-1`.

**Example 3:**  
**Input:**
```text
"abacbd"
```
**Output:**
```text
c
```
**Explanation:**
`a` repeats, `b` repeats, `c` occurs once → first non-repeating.

---

## 📌 Constraints
- String length: **1 ≤ length ≤ 10⁵**
- Characters can be any valid Unicode letters.
- Time complexity goal: **O(n)** using maps.

---

## 💻 Approaches

### **1️⃣ Without Java 8**
- Use a `LinkedHashMap<Character, Integer>` to count occurrences while maintaining insertion order.
- Traverse the string once to fill the map.
- Traverse the map to find the first character with count = 1.
- If none exists, return `-1`.

### **2️⃣ With Java 8 Streams**
- Convert string to stream of characters using `s.chars().mapToObj(...)`.
- Collect into a `LinkedHashMap` with `Collectors.groupingBy` and `Collectors.counting()` to preserve order.
- Stream over the entry set, filter for entries with value = 1, map to key, and use `findFirst()`.
- If not present, return `-1`.

---

## 📅 Personal Learning Note
I am practicing **Easy → Medium → Hard** coding problems daily.  
For each problem, I solve it both **with loops (traditional way)** and **with Java 8 streams**.  

This problem taught me:
- Importance of `LinkedHashMap` to preserve insertion order.
- Usage of `Collectors.groupingBy` with a custom map supplier (`LinkedHashMap::new`).
- Difference in handling return values (`null` vs `(char)-1`) in Java 8 stream solutions.
