# Sum of Even Numbers Problem

## 📜 Description
Given a list of integers, find the sum of all **even numbers** present in the list.

An **even number** is an integer that is exactly divisible by 2.  
Example:  
- In `[5, 2, 4, 7, 8]` → Even numbers are `2, 4, 8` → Sum = `14`.

---

## 📝 Problem Statement
**Input:**  
A list of integers.

**Output:**  
An integer representing the sum of all even numbers in the list.

---

## 💡 Example
**Example 1:**  
**Input:**
```text
[5, 2, 4, 7, 8]
```
**Output:**
```text
14
```

**Example 2:**  
**Input:**
```text
[1, 3, 5]
```
**Output:**
```text
0
```

---

## 📌 Constraints
- The list length is between 1 and 10³.
- The list may contain positive and negative integers.

---

## 💻 Approaches

### **1️⃣ Without Java 8**
- Iterate over the list.
- Check each element with `num % 2 == 0`.
- If even, add it to the sum.

### **2️⃣ With Java 8**
- Use `.stream()` to create a stream from the list.
- Convert `Integer` to primitive `int` with `.mapToInt(...)`.
- Filter to keep only even numbers.
- Use `.sum()` to get the total.

---

## 📅 Personal Learning Note
I am currently practicing **Easy → Medium → Hard** coding problems daily.  
I solve each problem **with** and **without** Java 8 features to strengthen my problem-solving skills.  
This problem helped me:
- Practice stream filtering and mapping.
- Understand unboxing with `mapToInt`.
- Compare traditional loops vs. Java 8 Streams.
