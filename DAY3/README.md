# Group Anagrams Problem

## 📜 Description
Given a list of strings, group together all strings that are **anagrams** of each other.

An **anagram** is a word formed by rearranging all letters of another word exactly once.  
Example:  
- `"bat"` → `"tab"`  
- `"eat"` → `"tea"`, `"ate"`

---

## 📝 Problem Statement
**Input:**  
A list of lowercase strings.

**Output:**  
A collection of lists where each list contains words that are anagrams of each other.

---

## 💡 Example

**Example 1:**  
**Input:**
```text
["bat", "tab", "eat", "tea", "tan", "nat"]
```
**Output:**
```text
[
  ["bat", "tab"],
  ["eat", "tea"],
  ["tan", "nat"]
]
```

**Example 2:**  
**Input:**
```text
["listen", "silent", "enlist", "abc", "cab", "bac"]
```
**Output:**
```text
[
  ["listen", "silent", "enlist"],
  ["abc", "cab", "bac"]
]
```

---

## 📌 Constraints
- All strings contain only lowercase English letters.
- Each word length: **1 ≤ length ≤ 100**
- Number of words: **1 ≤ N ≤ 10⁴**

---

## 💻 Approaches

### **1️⃣ Without Java 8**
- Use a `HashMap<String, List<String>>` to store groups.
- Count character frequency for each word.
- Convert frequency array to a string to use as a **key**.
- Append the word to the list mapped to this key.

### **2️⃣ With Java 8**
- Use `Collectors.groupingBy` on the stream of words.
- Generate the **frequency array** for each word.
- Convert frequency array to string and use it as the **grouping key**.

---

## 📅 Personal Learning Note
I am currently practicing **Easy → Medium → Hard** coding problems daily.  
I solve each problem **with** and **without** Java 8 features to strengthen problem-solving skills.  
This problem helped me understand:
- Using **frequency arrays** as unique keys for grouping anagrams.
- Difference between `getOrDefault` and `computeIfAbsent`.
- Using `Collectors.groupingBy` in Java 8.
