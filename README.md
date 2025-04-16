# Lab : Recursion Lab

### Overview
This lab focuses on implementing various recursive algorithms in Java. Recursion is a powerful programming technique where a function calls itself to solve a problem by breaking it down into smaller, more manageable subproblems.

### Learning Objectives
- Understand and apply basic and advanced recursion concepts
- Implement recursive solutions for mathematical sequences
- Create recursive algorithms for string manipulation
- Develop problem-solving skills using recursive thinking

### Prerequisites
- Basic Java programming knowledge
- Understanding of method calls and parameter passing
- Familiarity with conditional statements

### Project Setup

1. Open the `Lab10.java`java file in your IDE
2. Locate the TODO comments in the code that mark the sections you need to implement
3. Complete each of the required methods as per the specifications
4. Do not modify the existing code structure or change method signatures
5. Test your implementation using the provided menu options

### Exercises

### Level 1: Basic Recursion
1. **Factorial**: Calculate n! (n factorial)
2. **Counting Ears**: Count the total number of ears for n rabbits
3. **Fibonacci Sequence**: Generate the nth Fibonacci number

### Level 2: Recursive Number Processing
4. **Special Ear Count**: Count ears with a pattern (odd rabbits: 2 ears, even rabbits: 3 ears)
5. **Triangle Blocks**: Calculate total blocks in a triangle with n rows
6. **Digital Sum**: Calculate the sum of all digits in a non-negative integer

### Level 3: Digit Counting Recursively
7. **Counting Sevens**: Count occurrences of the digit 7 in a number
8. **Complex Digit Counting**: Count occurrences of 8 with special rules

### Level 4: String Recursion Basics
9. **Substring Counting**: Count occurrences of "hi" in a string
10. **Character Replacement**: Replace all 'x' with 'y' in a string
11. **Character Removal**: Remove all occurrences of 'x' from a string

### Level 5: Advanced String Recursion
12. **Adjacent Character Marking**: Place '*' between identical adjacent characters
13. **String Deduplication**: Remove duplicate adjacent characters

### Level 6: Complex Recursive Problems
14. **Conditional Substring Counting**: Count "hi" occurrences, but not when preceded by 'x'
15. **Substring with Boundaries**: Find length of largest substring that starts and ends with a given substring
16. **Bonus Challenge**:  **Tower of Hanoi**: Solve the classic Tower of Hanoi puzzle recursively


## Testing

The lab includes test cases in the `main` method that will verify your implementations. Run the program to see if your solutions produce the expected outputs.

```text
Testing factorial:
1
2
6

Testing countEars:
0
2
4

Testing fibonacci:
0
1
1
2
3
5

Testing specialEars:
0
2
5
7

Testing triangleBlocks:
0
1
3
6

Testing sumDigits:
9
13
3

Testing countSevens:
2
1
0

Testing countEights:
1
2
4

Testing countHi:
1
2
1

Testing replaceChar:
codey
yyhiyy
yhiyhiy

Testing removeChar:
ab
abc


Testing markPairs:
hel*lo
x*xy*y
a*a*a*a

Testing deduplicate:
yza
abcd
Helo

Testing countHiSpecial:
1
2
0

Testing substringLength:
9
3
9

Testing Tower of Hanoi (3 disks):
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C

Process finished with exit code 0
```

## Evaluation Criteria
- Correctness of recursive implementations
- Proper handling of base cases
- Efficiency of recursive solutions
- Code readability and quality

## Tips for Success
- Always identify the base case(s) first
- Think about how to break down the problem into smaller instances
- Trace through your algorithm with small examples
- Remember that recursive methods can have multiple base cases

Good luck with your recursion journey!