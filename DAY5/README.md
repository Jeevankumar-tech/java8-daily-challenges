# Second Most Frequent Element Problem

## 📜 Description

Given a list of integers, find the **second most frequent element**.

-   If multiple elements have the same frequency for the second max,
    return the **maximum element** among them.\
-   If all elements have the same frequency, return `-1`.

------------------------------------------------------------------------

## 📝 Problem Statement

**Input:**\
A list of integers (can include negative numbers).

**Output:**\
An integer representing the second most frequent element.

------------------------------------------------------------------------

## 💡 Example

**Example 1:**\
**Input:**

``` text
[5, 5, 5, 7, 7, 7, 8, 8, 8, 9, 9]
```

**Output:**

``` text
9
```

**Explanation:**\
- Frequencies → {5=3, 7=3, 8=3, 9=2}\
- Most frequent frequency = 3 (5, 7, 8)\
- Second most frequent frequency = 2 (9)\
- Answer = 9

------------------------------------------------------------------------

**Example 2:**\
**Input:**

``` text
[1, 3, 3, 4, 4]
```

**Output:**

``` text
1
```

**Explanation:**\
- Frequencies → {1=1, 3=2, 4=2}\
- Most frequent frequency = 2 (3, 4)\
- Second most frequent frequency = 1 (1)\
- Answer = 1

------------------------------------------------------------------------

**Example 3:**\
**Input:**

``` text
[10, 20, 30, 40]
```

**Output:**

``` text
-1
```

**Explanation:**\
- All elements appear once → only one frequency exists.\
- No second most frequent frequency → Answer = -1.

------------------------------------------------------------------------

## 📌 Constraints

-   `1 <= n <= 10^5`\
-   Elements can be positive or negative integers.

------------------------------------------------------------------------

## 📅 Personal Learning Note

I am currently practicing **Easy → Medium → Hard** coding problems
daily.\
I'm solving them both **with** and **without** Java 8 features to
strengthen my problem-solving and coding skills.
