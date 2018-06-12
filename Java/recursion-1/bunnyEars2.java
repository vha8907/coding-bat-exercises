/**
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. 
 * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. 
 * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 */

public int bunnyEars2(int bunnies) {
    if (bunnies == 0) {                     // base case (if there are no bunnies, there are no ears)
        return 0;
    }
    else if (bunnies % 2 == 1) {            // for every odd numbered bunny, return the counted number so far and add two
        return bunnyEars2(bunnies-1) + 2;
    }
    else {                                  // since we handled the no bunny scenario and the odd numbered, the else handles
        return bunnyEars2(bunnies-1) + 3;   // the even numbered bunnies (also, we don't need to put a final return statement with it)
    }
}
