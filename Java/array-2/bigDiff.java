import java.lang.Math;

/**
 * Given an array length 1 or more of ints, return the difference between the 
 * largest and smallest values in the array. Note: the built-in Math.min(v1, v2) 
 * and Math.max(v1, v2) methods return the smaller or larger of two values.
 */

public int bigDiff(int[] nums) {

    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > largest) {
            largest = nums[i]
        }
        if (nums[i] < smallest) {
            smallest = nums[i];
        }
    }

    return largest - smallest;
}
