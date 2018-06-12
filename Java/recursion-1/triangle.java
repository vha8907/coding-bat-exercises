/**
 * We have triangle made of blocks. The topmost row has 1 block, 
 * the next row down has 2 blocks, the next row has 3 blocks, and so on. 
 * Compute recursively (no loops or multiplication) the total number of 
 * blocks in such a triangle with the given number of rows.
 */

public int triangle(int rows) {
    if (rows == 0) {                        // base case (if there are no rows, there are no blocks)
        return 0;
    }
    else {
        return rows + triangle(rows-1);     // returns the row number plus how many blocks have been counted already,
    }                                       // thus being the recursive solution to the problem (since how many blocks
}                                           // a row has is equal to its number, so its row number + blocks counted)
