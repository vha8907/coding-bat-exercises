/**
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. 
 * Compute the result recursively (without loops).
 */

public int factorial(int n) {
    if (n == 1) {                   // base case for recursive factorials
      return 1;
    }
    return n * factorial(n-1);      // function calls itself until reaches base case (thus recursion)
}