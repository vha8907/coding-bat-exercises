/**
 * Return the number of even ints in the given array. 
 * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 * Examples:
 *  countEvens([2, 1, 2, 3, 4]) → 3
 *  countEvens([2, 2, 0]) → 3
 *  countEvens([1, 3, 5]) → 0
 */

public int countEvens(int[] nums) {
    int counter = 0;                    //a counter variable must be initialized

    for (int i=0; i<nums.length; i++) { //Java's for-each loop

        if (nums[i] % 2 == 0) {         //checks if the current element of the array
            counter += 1;               //being evaluated is an even number, if so,
        }                               //the counter increases

    }
  return counter;                       //outputs the number by the end of the loop
}
