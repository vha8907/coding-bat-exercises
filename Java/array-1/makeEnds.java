/**
 * Given an array of ints, return a new array length 2 containing the first and 
 * last elements from the original array. The original array will be length 1 or more.
 */

public int[] makeEnds(int[] nums) {
    int[] output = {nums[0], nums[nums.length-1]};      // This type of array assignment (array literals or constants) 
    return output;                                      // is only allowed in initializers. Likewise, check the middleWay exercise 
}                                                       // for another style of utilization
  