# INTRODUCTION
For my Algorithms Design course, I was tasked with creating an algorithm that met the following criteria:

- Generate array from input file
- Handle potential arrays
- Time Complexity should be O(n)

The algorithm should analyze an array of size n. For example [10,4,1,4,14,2]. Then, it should find the highest sum possible for nearby numbers.

For example, is it:

14 which is derived from [10,4]?
15 which is derived from [10,4,1]?
20 which is derived from [4,14,2]?
or it could even be the entire array which leads to sum 35. This would not always be the case if we introduced negative numbers.

