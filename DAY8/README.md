# Group Anagrams Problem

## 📜 Description

Given a list of strings, group the words that are **anagrams** of each
other.\
Two words are anagrams if they contain the **same characters** in the
same frequency, but possibly in a different order.

------------------------------------------------------------------------

## 📝 Problem Statement

**Input:**\
A list of words.

**Output:**\
Groups of anagrams, where each group contains words that are anagrams of
each other.

------------------------------------------------------------------------

## 💡 Example

**Example 1:**\
**Input:**

``` text
["eat", "tea", "tan", "ate", "nat", "bat"]
```

**Output:**

``` text
[["eat","tea","ate"], ["tan","nat"], ["bat"]]
```

**Explanation:**\
- `"eat", "tea", "ate"` are anagrams → grouped together.\
- `"tan", "nat"` are anagrams → grouped together.\
- `"bat"` has no anagram → remains alone.

------------------------------------------------------------------------

## 📌 Constraints

-   1 ≤ number of words ≤ 10⁴\
-   Each word length ≤ 100\
-   All words consist of lowercase English letters.

------------------------------------------------------------------------

## 💻 Approaches

### **1️⃣ Without Java 8 (Using Loops)**

-   Use a `HashMap<String, List<String>>` where the **key** is the
    *signature* of the word.
    -   Approach 1: Sort the characters of the word → use sorted string
        as key.\
    -   Approach 2: Count frequency of each character using `int[26]` →
        convert to string → use as key.\
-   Insert the word into the list corresponding to its key.

**Complexity:**\
- Sorting-based: O(N × L log L)\
- Frequency-based: O(N × L)

(where N = number of words, L = length of each word)

------------------------------------------------------------------------

### **2️⃣ With Java 8 Streams**

-   Stream over the list of words.\
-   Use `Collectors.groupingBy` with a classifier function that
    generates the **key**.\
-   The classifier function can be:
    -   Sorted characters of the word (simple & readable).\
    -   Frequency array converted to string (efficient).\
-   Collect into `Map<String, List<String>>`.\
-   The grouped values are the required anagram groups.

------------------------------------------------------------------------

## 📅 Personal Learning Note

I am practicing **Easy → Medium → Hard** coding problems daily.\
For each problem, I solve it both **traditionally** (loops & maps) and
**using Java 8 streams**.

This problem taught me: - How to generate **keys** for grouping
(`sorted string` vs `frequency array`).\
- How `Collectors.groupingBy` internally works like
`map.computeIfAbsent`.\
- Why `Arrays.toString(int[])` must be used instead of
`String.valueOf(int[])` when turning frequency arrays into keys.
