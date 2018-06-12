/**
 * Given an int array length 2, return true if it contains a 2 or a 3.
 */

public boolean has23(int[] nums) {
    if ((nums[0] == 2 || nums[0] == 3) 
       ||
       (nums[1] == 2 || nums[1] == 3))      // if the 1st or 2nd elements are 1 or 2,
       {                                    // return true (grouped like that for the sake of organizing the conditionals)
         return true;
       }
       return false;
}
  