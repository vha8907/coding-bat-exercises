/**
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
 * (Use the % "mod" operator.)
 */

public boolean or35(int n) {
    if ((n % 5 == 0) || (n % 3 == 0)) {     // checks if the provided integer is divisible by either 5 or 3
      return true;
    }
    else {                                  // if not, the functions returns false
      return false;
    }
}


// Not the most straightforward solution, but emphasizes legibility and comprehension. 