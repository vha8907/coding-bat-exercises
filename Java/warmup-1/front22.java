/**
 * Given a string, take the first 2 chars and return the string with the 2 chars
 * added at both the front and back, so "kitten" yields "kikittenki". 
 * If the string length is less than 2, use whatever chars are there.
 */

public String front22(String str) {
    if (str.length() >= 2) {                    // checks for length
        String firstTwo = str.substring(0,2);   // gets a substring that is composed by the first two chars
        return firstTwo + str + firstTwo;       // returns new string with substrings added, front and back
    }
    else {                                      // if length is less than two, the string is either one letter
        return str + str + str;                 // or empty, so we can just return itself thrice
    }
}
  