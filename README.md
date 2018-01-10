# InterviewQuestions
Answers to coding problems that may get asked in interviews.
Questions from https://www.testdome.com/d/java-interview-questions/4
Answers written by Benjamin Korobkin.

Here is a summary of each question in this repo:

1) PALINDROME
A palindrome is a word that reads the same backward or forward.

Write a function that checks if a given word is a palindrome. Character case should be ignored.

For example, isPalindrome("Deleveled") should return true as character case should be ignored, resulting in "deleveled", which is a palindrome since it reads the same backward and forward.

2) USER INPUT
User interface contains two types of user input controls: TextInput, which accepts all characters and NumericInput, which accepts only digits.

Implement the class TextInput that contains:

Public method void add(char c) - adds the given character to the current value
Public method String getValue() - returns the current value
Implement the class NumericInput that:

Inherits from TextInput
Overrides the add method so that each non-numeric character is ignored
For example, the following code should output "10":

TextInput input = new NumericInput();
input.add('1');
input.add('a');
input.add('0');
System.out.println(input.getValue());

3) BINARY SEARCH TREE
Binary search tree (BST) is a binary tree where the value of each node is larger or equal to the values in all the nodes in that node's left subtree and is smaller than the values in all the nodes in that node's right subtree.

Write a function that checks if a given binary search tree contains a given value.

For example, for the following tree:

n1 (Value: 1, Left: null, Right: null)
n2 (Value: 2, Left: n1, Right: n3)
n3 (Value: 3, Left: null, Right: null)
Call to contains(n2, 3) should return true since a tree with root at n2 contains number 3.

4) TWO SUM
Write a function that, given a list and a target sum, returns zero-based indices of any two distinct elements whose sum is equal to the target sum. If there are no such elements, the function should return null.

For example, findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12) should return a single dimensional array with two elements and contain any of the following pairs of indices:

1 and 4 (3 + 9 = 12)
2 and 3 (5 + 7 = 12)
3 and 2 (7 + 5 = 12)
4 and 1 (9 + 3 = 12)

5) FOLDERS
Implement a function folderNames, which accepts a string containing an XML file that specifies folder structure and returns all folder names that start with startingLetter. The XML format is given in the example below.

For example, for the letter 'u' and an XML file:

<?xml version="1.0" encoding="UTF-8"?>
<folder name="c">
    <folder name="program files">
        <folder name="uninstall information" />
    </folder>
    <folder name="users" />
</folder>
the function should return a collection with items "uninstall information" and "users" (in any order).

6) SORTED SEARCH
Implement function countNumbers that accepts a sorted array of integers and counts the number of array elements that are less than the parameter lessThan.

For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because there are two array elements less than 4.

7) TRAIN COMPOSITION
A TrainComposition is built by attaching and detaching wagons from the left and the right sides.

For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left, we get a composition of two wagons (13 and 7 from left to right). Now the first wagon that can be detached from the right is 7 and the first that can be detached from the left is 13.

Implement a TrainComposition that models this problem.

8) PATH
Write a function that provides change directory (cd) function for an abstract file system.

Notes:

Root path is '/'.
Path separator is '/'.
Parent directory is addressable as "..".
Directory names consist only of English alphabet letters (A-Z and a-z).
The function should support both relative and absolute paths.
The function will not be passed any invalid paths.
Do not use built-in path-related functions.
For example:

Path path = new Path("/a/b/c/d");
path.cd('../x');
System.out.println(path.getPath());
should display '/a/b/c/x'.
