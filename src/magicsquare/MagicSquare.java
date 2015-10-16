/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package magicsquare;

/**
 *
 * @author DSTIGANT
 */
public class MagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use static initialization to set sq1 to the array
        // 4 9 2
        // 3 5 7
        // 8 1 6
        int [][] sq1 = { };
        
        printSquareWithSums( sq1 );
        System.out.println( "Is magic? " + isMagic( sq1 ) );
        System.out.println("");
        
        // use static initialization to set sq2 to the array
        // 17	24	1	8	15	
        // 23	5	7	14	16	
        // 4	6	13	20	22	
        // 10	12	19	21	3	
        // 11	18	25	2	9
        int [][] sq2 = {  };
        
        printSquareWithSums( sq2 );
        System.out.println( "Is magic? " + isMagic( sq2 ) );
        System.out.println("");
        
        // use static initialization to set sq3 to the array
        // 3	5	7	
        // 8	1	6	
        // 4	9	2
        int [][] sq3 = { };
        
        printSquareWithSums( sq3 );
        System.out.println( "Is magic? " + isMagic( sq3 ) );
        System.out.println("");
        
        int [][] sq4 = generateOddMagicSquare( 7 );
        
        printSquareWithSums( sq4 );
        System.out.println( "Is magic? " + isMagic( sq4 ) );
        System.out.println("");
    }
    
    // rowSum
    // computes the sum of the entries in a row of a square matrix
    // inputs:
    // sq - the square matrix
    // r - the row to add up
    // output:
    // the sum of the entries in row r
    // ex:
    // if sq is
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // and r is 1
    // rowSum( sq, r ) ==> 15
    public static int rowSum( int [][] sq, int r )
    {
        return 0;
    }
    
    // colSum
    // computes the sum of the entries in a column of a square matrix
    // inputs:
    // sq - the square matrix
    // c - the column to add up
    // output:
    // the sum of the entries in row r
    // ex:
    // if sq is
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // and c is 1
    // colSum( sq, c ) ==> 15
    public static int colSum( int [][] sq, int c )
    {
        return 0;
    }
    
    // mainDiagonalSum
    // computes the sum of the entries on the main diagonal (top left to bottom right) of a square matrix
    // inputs:
    // sq - the square matrix
    // output:
    // the sum of the entries in row r
    // ex:
    // if sq is
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // mainDiagonalSum( sq ) ==> 15
    public static int mainDiagonalSum( int [][] sq )
    {
        return 0;
    }
    
    // offDiagonalSum
    // computes the sum of the entries on the off diagonal (top right to bottom left) of a square matrix
    // inputs:
    // sq - the square matrix
    // output:
    // the sum of the entries in row r
    // ex:
    // if sq is
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // offDiagonalSum( sq ) ==> 15
    public static int offDiagonalSum( int [][] sq )
    {
        return 0;
    }
    
    // printSquareWithSums
    // prints out the entries of the square matrix with row sums on the right,
    // column sums along the bottom and diagonal sums at the bottom right and top right
    // for example, if sq is
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // the function will produce the output:
    //          		15
    //  1	2	3	6
    //  4	5	6	15
    //  7	8	9	24
    //  12	15	18	15
    // Hint: use tabs (\t) between entries to get everything to line up nicely
    public static void printSquareWithSums( int [][] sq )
    {
        
    }
    
    // isMagic
    // returns true if the square matrix is a magic square, false otherwise.  That is, the
    // sums of each row, each column and each diagonal are all the same.
    // input:
    // sq - the square matrix
    // output:
    // true if sq is magic, false otherwise
    public static boolean isMagic( int [][] sq )
    {
        return false;
    }
    
    // generateOddMagicSquare
    // produces a magic n x n (n is odd) square using the numbers 1..n^2 and the diagonalization method:
    // start counting with 1 at the bottom center of the square
    // each step, go down one, and right one to place the next number.  
    // if you are off the end of the square, resume at the top or left side
    // repeat until you get to n.
    // After placing n, instead of going down 1, right 1, go up 1 to place n+1, then resume going down and right
    // Every n entries, go up 1 instead of down and right.
    // For example, if n is 5, you should produce the array:
    //
    // 11	18	25	2	9	
    // 10	12	19	21	3	
    // 4	6	13	20	22	
    // 23	5	7	14	16	
    // 17	24	1	8	15
    // 
    // Note that 1 is the bottom center entry.  Going down 1 and right 1 takes you off the bottom edge
    // so the 2 goes in the top row, 4th column. 3 is D1R1 from there.  Going D1R1 from the 3 takes you
    // off the right side, so 4 is in the 3rd row, 1st column and 5 is D1R1 from there.  That's 5 entries
    // so the 6 is above the 5 rather than D1R1.  7 and 8 are D1R1 from the 6 etc.
    //
    // inputs:
    // n - the size of the square to create.
    // NOTE: n MUST be a postive, odd integer
    // output:
    // an n x n array containing the numbers 1..n^2 arranged so that the array forms a magic square
    public static int [][] generateOddMagicSquare( int n )
    {
        int [][] scarlet = new int[0][0];
        return scarlet;
    }
    
}
