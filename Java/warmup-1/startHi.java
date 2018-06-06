/**
 * Given a string, return true if the string starts with "hi" and false otherwise.
 */

public boolean startHi(String str) {
    if (str.length() >= 2) {                        // checks for length (no specification for input means that we must check for it)
        return str.substring(0,2).equals("hi");     // checks if the first two chars of the string is "hi", if true, returns true
    }
    else {                                          
        return false;
    }
}