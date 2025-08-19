# Longest Consecutive Sequence Problem

## 📜 Description
Given an unsorted list of integers, find the **longest consecutive sequence** of numbers (in increasing order) and return both the **sequence** and its **length**.

A consecutive sequence is a set of numbers that appear one after another without gaps. For example:
- `[1,2,3,4]` is consecutive.
- `[3,5,6]` is **not consecutive** because `4` is missing.

---

## 📝 Problem Statement
**Input:**  
A list of integers (may contain duplicates, may be negative).

**Output:**  
- The longest consecutive sequence as a list.
- The length of that sequence.

---

## 💡 Example

**Example 1:**  
**Input:**
```text
[100, 4, 200, 1, 3, 2]
```
**Output:**
```text
Longest Sequence: [1, 2, 3, 4]
Length: 4
```

**Example 2:**  
**Input:**
```text
[9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6]
```
**Output:**
```text
Longest Sequence: [3, 4, 5, 6, 7, 8, 9]
Length: 7
```

---

## 📌 Constraints
- Size of list: **1 ≤ N ≤ 10⁵**
- Values can be negative or positive.
- Time complexity goal: **O(n)** (using HashSet) or **O(n log n)** (using sorting).

---

## 💻 Approaches

### **1️⃣ Brute Force (Sorting + Loop)**
- Sort the list.
- Traverse sequentially and count streaks of consecutive numbers.
- Track the longest streak and store the numbers.

**Complexity:**
- Time: `O(n log n)`
- Space: `O(1)` (or `O(n)` if storing sequence)

### **2️⃣ Optimal HashSet Approach**
- Insert all numbers into a `HashSet` (for O(1) lookup).
- For each number, only start building a sequence if `(num-1)` is not in the set.
- Expand forward until the sequence breaks.
- Track the longest sequence.

**Complexity:**
- Time: `O(n)`
- Space: `O(n)`

### **3️⃣ Java 8 Streams Approach**
- Use `.filter(x -> !set.contains(x-1))` to find sequence starting points.
- For each starting point, build the sequence using an iterative expansion.
- Use `.max(Comparator.comparingInt(List::size))` to get the longest sequence.

**Complexity:**
- Time: `O(n)`
- Space: `O(n)`

---

## 📅 Personal Learning Note
I am solving daily coding challenges (Easy → Medium → Hard).  
For each problem, I practice both **with Java 8 streams** and **without Java 8** to build problem-solving depth.

This problem taught me:
- Why we use `!set.contains(num-1)` → ensures we only start from the beginning of sequences.
- How to expand sequences efficiently using HashSet lookups.
- How `filter`, `map`, and `max` in Java 8 streams can replace nested loops neatly.
