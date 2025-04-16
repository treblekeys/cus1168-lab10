package academy.javapro.lab10;

public class Lab10 {

    /**
     * Exercise 1: Factorial
     * Returns the factorial of n (n!)
     *
     * @param n - A positive integer
     * @return The factorial of n
     */
    public static int factorial(int n) {
        // Base case: factorial of 1 is 1
        // TODO: Implement the base case, if n is 0, return 1

        // Recursive case: n! = n * (n-1)!
        // TODO: Implement the recursive case, return n * factorial(n - 1)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 2: Counting Ears
     * Counts the total number of ears for n rabbits
     *
     * @param n - Number of rabbits
     * @return Total number of ears
     */
    public static int countEars(int n) {
        // Base case: no rabbits means no ears
        // TODO: Implement the base case, if n is 0, return 0

        // Recursive case: 2 ears for this rabbit + ears for the rest
        // TODO: Implement the recursive case, return 2 + countEars(n - 1)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 3: Fibonacci Sequence
     * Returns the nth Fibonacci number
     *
     * @param n - Position in the sequence (0-indexed)
     * @return The nth Fibonacci number
     */
    public static int fibonacci(int n) {
        // Base cases: first two numbers in the sequence
        // TODO: Implement the base cases, if n is 0, return 0; if n is 1, return 1

        // Recursive case: sum of the previous two numbers
        // TODO: Implement the recursive case, return fibonacci(n - 1) + fibonacci(n - 2)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Level 2: Recursive Number Processing

    /**
     * Exercise 4: Special Ear Count
     * Counts ears with a special pattern: odd-numbered rabbits have 2 ears,
     * even-numbered rabbits have 3 ears
     *
     * @param n - Number of rabbits
     * @return Total number of ears
     */
    public static int specialEars(int n) {
        // Base case: no rabbits means no ears
        // TODO: Implement the base case, if n is 0, return 0

        // Recursive case with pattern: odd rabbits (2 ears), even rabbits (3 ears)
        // TODO: If n is odd, return 2 + specialEars(n - 1);
        // TODO: Otherwise, return 3 + specialEars(n - 1);

        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 5: Triangle Blocks
     * Calculates the total number of blocks in a triangle with n rows
     *
     * @param n - Number of rows
     * @return Total number of blocks
     */
    public static int triangleBlocks(int n) {
        // Base case: no rows means no blocks
        // TODO: Implement the base case, if n is 0, return 0

        // Recursive case: blocks in this row + blocks in the rows above
        // TODO: Implement the recursive case, return n + triangleBlocks(n - 1)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 6: Digital Sum
     * Calculates the sum of all digits in a non-negative integer
     *
     * @param n - A non-negative integer
     * @return Sum of all digits
     */
    public static int sumDigits(int n) {
        // Base case: single digit number
        // TODO: Implement the base case, if n is less than 10, return n

        // Recursive case: rightmost digit + sum of the rest
        // TODO: Implement the recursive case, return (n % 10) + sumDigits(n / 10)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Level 3: Digit Counting Recursively

    /**
     * Exercise 7: Counting Sevens
     * Counts occurrences of the digit 7 in a number
     *
     * @param n - A non-negative integer
     * @return Count of digit 7
     */
    public static int countSevens(int n) {
        // Base case: no more digits
        // TODO: Implement the base case, if n is 0, return 0

        // Check if rightmost digit is 7
        // TODO: If n % 10 == 7, return 1 + countSevens(n / 10);

        // TODO: Otherwise, return countSevens(n / 10);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 8: Complex Digit Counting
     * Counts occurrences of 8 with special rule: an 8 with another 8 to its left counts double
     *
     * @param n - A non-negative integer
     * @return Weighted count of digit 8
     */
    public static int countEights(int n) {
        // Base case: no more digits
        // TODO: Implement the base case, if n is 0, return 0

        // Get the rightmost and second-rightmost digits
        // TODO: Create variables rightDigit and secondRightDigit
        // TODO: Assign rightDigit to n % 10
        // TODO: Assign secondRightDigit to (n / 10) % 10

        // Check special case: 8 preceded by another 8
        // TODO: If rightDigit == 8 and secondRightDigit == 8, return 2 + countEights(n / 10);

        // Normal case: just a regular 8
        // TODO: If rightDigit == 8, return 1 + countEights(n / 10);

        // No 8 in the rightmost position
        // TODO: Otherwise, return countEights(n / 10);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Level 4: String Recursion Basics

    /**
     * Exercise 9: Substring Counting
     * Counts occurrences of "hi" in a string
     *
     * @param str - Input string
     * @return Count of "hi" occurrences
     */
    public static int countHi(String str) {
        // Base case: string too short to contain "hi"
        // TODO: Implement the base case, if str.length() < 2, return 0

        // Check if the first two characters are "hi"
        // TODO: If str.startsWith("hi"), return 1 + countHi(str.substring(2));

        // TODO: Otherwise, check the next character by calling countHi(str.substring(1));

        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 10: Character Replacement
     * Replaces all 'x' with 'y' in a string
     *
     * @param str - Input string
     * @return String with 'x' replaced by 'y'
     */
    public static String replaceChar(String str) {
        // Base case: empty string
        // TODO: Implement the base case, if str.length() == 0, return ""

        // Replace 'x' with 'y' if first character is 'x'
        // TODO: If str.charAt(0) == 'x', return "y" + replaceChar(str.substring(1));

        // TODO: Otherwise, return str.charAt(0) + replaceChar(str.substring(1));

        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 11: Character Removal
     * Removes all occurrences of 'x' from a string
     *
     * @param str - Input string
     * @return String with 'x' removed
     */
    public static String removeChar(String str) {
        // Base case: empty string
        // TODO: Implement the base case, if str.length() == 0, return ""

        // Skip 'x' characters
        // TODO: If str.charAt(0) == 'x', return removeChar(str.substring(1));

        // TODO: Otherwise, return str.charAt(0) + removeChar(str.substring(1));
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Level 5: Advanced String Recursion

    /**
     * Exercise 12: Adjacent Character Marking
     * Places '*' between identical adjacent characters
     *
     * @param str - Input string
     * @return String with '*' between identical adjacent chars
     */
    public static String markPairs(String str) {
        // Base case: single character or empty string
        // TODO: Implement the base case, if str.length() <= 1, return str

        // Check if first and second characters are identical
        // TODO: If str.charAt(0) == str.charAt(1), return str.charAt(0) + "*" + markPairs(str.substring(1));

        // TODO: Otherwise, return str.charAt(0) + markPairs(str.substring(1));
        throw new UnsupportedOperationException("Not implemented yet");

    }

    /**
     * Exercise 13: String Deduplication
     * Removes duplicate adjacent characters
     *
     * @param str - Input string
     * @return String with duplicates removed
     */
    public static String deduplicate(String str) {
        // Base case: single character or empty string
        // TODO: Implement the base case, if str.length() == 0, return ""

        // Remove duplicate adjacent characters
        // TODO: If str.charAt(0) == str.charAt(1), return deduplicate(str.substring(1));

        // TODO: Otherwise, return str.charAt(0) + deduplicate(str.substring(1));
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Level 6: Complex Recursive Problems

    /**
     * Exercise 14: Conditional Substring Counting
     * Counts "hi" occurrences, but not when preceded by 'x'
     *
     * @param str - Input string
     * @return Count of valid "hi" occurrences
     */
    public static int countHiSpecial(String str) {
        // Base case: string too short to contain "hi"
        // TODO: Implement the base case, if str.length() < 2, return 0

        // Check for "hi" at the beginning
        // TODO: If str.startsWith("hi"), return 1 + countHiSpecial(str.substring(2));

        // Check for "xhi" pattern (need to check if we have enough characters)
        // TODO: If str.length() >= 3 && str.charAt(0) == 'x' && str.startsWith("hi", 1), return countHiSpecial(str.substring(3));

        // TODO: Otherwise, return countHiSpecial(str.substring(1));
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Exercise 15: Substring with Boundaries
     * Finds length of largest substring that starts and ends with a given substring
     *
     * @param str - Input string
     * @param sub - Substring to look for
     * @return Length of largest substring
     */
    public static int substringLength(String str, String sub) {
        // Base case: string is shorter than the substring
        // TODO: Implement the base case, if str.length() < sub.length(), return 0

        // Check if string starts and ends with the substring
        // TODO: Create boolean variables startsWith and endsWith
        // TODO: Assign startsWith to str.startsWith(sub)
        // TODO: Assign endsWith to str.endsWith(sub)

        // TODO: If both are true, return str.length()

        // Try removing first character
        // TODO: Create a variable removeFirst and assign it to substringLength(str.substring(1), sub)

        // Try removing last character
        // TODO: Create a variable removeLast and assign it to substringLength(str.substring(0, str.length() - 1), sub)

        // Return the larger result
        // TODO: Return the maximum of removeFirst and removeLast
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Bonus Challenge: Tower of Hanoi
     * Solves the Tower of Hanoi puzzle with n disks
     *
     * @param n         - Number of disks
     * @param source    - Source peg
     * @param auxiliary - Auxiliary peg
     * @param target    - Target peg
     */
    public static void towerOfHanoi(int n, char source, char auxiliary, char target) {
        // Base case: only one disk to move
        // TODO: Implement the base case, if n is 1, print Move disk 1 from source to target

        // Move n-1 disks from source to auxiliary using target as temporary
        // TODO: Call towerOfHanoi(n - 1, source, target, auxiliary);

        // Move the nth disk from source to target
        // TODO: Print Move disk n from source to target

        // Move n-1 disks from auxiliary to target using source as temporary
        // TODO: Call towerOfHanoi(n - 1, auxiliary, source, target);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // Main method with test cases
    public static void main(String[] args) {
        // Test factorial
        System.out.println("Testing factorial:");
        System.out.println(factorial(1));  // 1
        System.out.println(factorial(2));  // 2
        System.out.println(factorial(3));  // 6

        // Test countEars
        System.out.println("\nTesting countEars:");
        System.out.println(countEars(0));  // 0
        System.out.println(countEars(1));  // 2
        System.out.println(countEars(2));  // 4

        // Test fibonacci
        System.out.println("\nTesting fibonacci:");
        System.out.println(fibonacci(0));  // 0
        System.out.println(fibonacci(1));  // 1
        System.out.println(fibonacci(2));  // 1
        System.out.println(fibonacci(3));  // 2
        System.out.println(fibonacci(4));  // 3
        System.out.println(fibonacci(5));  // 5

        // Test specialEars
        System.out.println("\nTesting specialEars:");
        System.out.println(specialEars(0));  // 0
        System.out.println(specialEars(1));  // 2
        System.out.println(specialEars(2));  // 5
        System.out.println(specialEars(3));  // 7

        // Test triangleBlocks
        System.out.println("\nTesting triangleBlocks:");
        System.out.println(triangleBlocks(0));  // 0
        System.out.println(triangleBlocks(1));  // 1
        System.out.println(triangleBlocks(2));  // 3
        System.out.println(triangleBlocks(3));  // 6

        // Test sumDigits
        System.out.println("\nTesting sumDigits:");
        System.out.println(sumDigits(126));  // 9 (1+2+6)
        System.out.println(sumDigits(49));   // 13 (4+9)
        System.out.println(sumDigits(12));   // 3 (1+2)

        // Test countSevens
        System.out.println("\nTesting countSevens:");
        System.out.println(countSevens(717));  // 2
        System.out.println(countSevens(7));    // 1
        System.out.println(countSevens(123));  // 0

        // Test countEights
        System.out.println("\nTesting countEights:");
        System.out.println(countEights(8));     // 1
        System.out.println(countEights(818));   // 2
        System.out.println(countEights(8818));  // 4 (second 8 counts double)

        // Test countHi
        System.out.println("\nTesting countHi:");
        System.out.println(countHi("xxhixx"));   // 1
        System.out.println(countHi("xhixhix"));  // 2
        System.out.println(countHi("hi"));       // 1

        // Test replaceChar
        System.out.println("\nTesting replaceChar:");
        System.out.println(replaceChar("codex"));   // "codey"
        System.out.println(replaceChar("xxhixx"));  // "yyhiyy"
        System.out.println(replaceChar("xhixhix")); // "yhiyhiy"

        // Test removeChar
        System.out.println("\nTesting removeChar:");
        System.out.println(removeChar("xaxb"));  // "ab"
        System.out.println(removeChar("abc"));   // "abc"
        System.out.println(removeChar("xx"));    // ""

        // Test markPairs
        System.out.println("\nTesting markPairs:");
        System.out.println(markPairs("hello"));  // "hel*lo"
        System.out.println(markPairs("xxyy"));   // "x*xy*y"
        System.out.println(markPairs("aaaa"));   // "a*a*a*a"

        // Test deduplicate
        System.out.println("\nTesting deduplicate:");
        System.out.println(deduplicate("yyzzza"));  // "yza"
        System.out.println(deduplicate("abbbcdd")); // "abcd"
        System.out.println(deduplicate("Hello"));   // "Helo"

        // Test countHiSpecial
        System.out.println("\nTesting countHiSpecial:");
        System.out.println(countHiSpecial("ahixhi"));  // 1
        System.out.println(countHiSpecial("ahibhi"));  // 2
        System.out.println(countHiSpecial("xhixhi"));  // 0

        // Test substringLength
        System.out.println("\nTesting substringLength:");
        System.out.println(substringLength("catcowcat", "cat"));     // 9
        System.out.println(substringLength("catcowcat", "cow"));     // 3
        System.out.println(substringLength("cccatcowcatxx", "cat")); // 9

        // Test Tower of Hanoi
        System.out.println("\nTesting Tower of Hanoi (3 disks):");
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}
