/**
 * We have a number of bunnies and each bunny has two big floppy ears. 
 * We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
 */

public int bunnyEars(int bunnies) {
    if (bunnies == 0) {                 // if there are no bunnies, there are no ears :(
      return 0;
    }
    else if (bunnies == 1) {            // base case
      return 2;
    }
    return bunnyEars(bunnies-1) + 2;    
  }
  