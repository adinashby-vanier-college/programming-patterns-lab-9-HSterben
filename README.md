[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/j9WyAwBp)
# Programming Patterns - Lab 9

This template repository is the starter project for Programming Patterns Lab 9. Written in Java, and tested with Gradle/JUnit.

### Question(s)

We can shift a string by shifting each of its letters to its successive letter.

- For example, "abc" can be shifted to be "bcd".

We can keep shifting the string to form a sequence.

- For example, we can keep shifting "abc" to form the sequence: "abc" -> "bcd" -> ... -> "xyz".

Given an array of strings strings, group all strings[i] that belong to the same shifting sequence. You may return the answer in **any order**.

Example 1:

Input: strings = ["abc","bcd","acef","xyz","az","ba","a","z"]  
Output: [["acef"],["a","z"],["abc","bcd","xyz"],["az","ba"]]

Example 2:

Input: strings = ["a"]
Output: [["a"]]

**Constraints**

1 <= strings.length <= 200  
1 <= strings[i].length <= 50  
strings[i] consists of lowercase English letters.

### Setup Command

`gradle clean`

### Run Command

`gradle test`
