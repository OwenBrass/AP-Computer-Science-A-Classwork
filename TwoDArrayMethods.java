/**
* Classwork #1: Define the methods for problems #1-9
*/
public class TwoDArrayMethods
{

    public static void main(String[] args)
    {
        // Decaling a 2D array in one line of code, to be used for testing
        int[][] board = {{2, 4, 6, 8},
        {1, 2, 7, 9},
        {4, 6, 1, 10},
        {1, 3, 11, 2}};

        // These are the method calls for the static methods you will define
        printMatrix(board);
        findTotal(board);
        findMax(board);
        sumRows(board);
        sumColumns(board);
        largestinRows(board);
        largestinColumns(board);
        System.out.println(isSquare(board));
        System.out.println(isRowMagic(board));
        System.out.println(isColumnMagic(board));
    }

    /* #1 Write a method for printing the elements in an array. Each row should
       * be on its own line, so that the 2D array prints as a matrix of data
     */
    public static void printMatrix(int[][] matrix)
    {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
    /*
    * #2 Write a method to print the sum of all elements in the array. The
    * The output should read:
    * &quot;The sum of all elements in the array is 77
    */
    public static void findTotal(int[][] matrix)
    {
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println("The sum of all elements in the array is " + sum);
    }
    /*
    * #3 Write a method that prints the maximum value in the entire 2D array.
    * For example, this method call in our main method on page 1 should read:
    * &quot;The maximum value in the entire matrix is 11
    */
    public static void findMax(int[][] matrix)
    {
        int max = matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println("The maximum value in the entire matrix is " + max);
    }

    /* #4 Write a method for printing the sum of each row in the array

    * For example, this method call in our main method should output:
    * &quot;The sum of the elements in row 0 is 20.&quot;
    * &quot;The sum of the elements in row 1 is 19.&quot; etc.
    */
   public static void sumRows(int[][] matrix)
   {
       for(int i=0; i<matrix.length; i++){
            int rowSum = 0;
            for(int j=0; j<matrix[0].length; j++){
                rowSum+=matrix[i][j];
            }
            System.out.println("The sum of the elements in row " + i + " is " + rowSum);
        }
    }

   /* #5 Write a method for finding the sum of each column in the array
   * For example, this method call in our main method should output:
   * &quot;The sum of the elements in column 0 is 8&quot;
   * &quot;The sum of the elements in column 1 is 15&quot; etc.
   */
    public static void sumColumns(int[][] matrix)
    {
        for(int j=0; j<matrix[0].length; j++){
            int colSum = 0;
            for(int i=0; i<matrix.length; i++){
                colSum+=matrix[i][j];
            }
            System.out.println("The sum of the elements in column " + j + " is " + colSum);
        }
    }

    /* #6 Write a method for printing the largest value in each row.
    * For example, this method call in our main method should output:

    * &quot;The largest value in row 0 is 8&quot; etc.
    * &quot;The largest value in row 1 is 9&quot; etc.
    */
    public static void largestinRows(int[][] matrix)
    {
        for(int i=0; i<matrix.length; i++){
            int rowMax = matrix[i][0];
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > rowMax)
                    rowMax = matrix[i][j];
            }
            System.out.println("The largest value in row " + i + " is " + rowMax);
        }
    }
    /* #7 Write a method for printing the largest value in each column.
    * For example, this method call in our main method should output:
    * &quot;The largest value in column 0 is 4&quot; etc.
    * &quot;The largest value in column 1 is 6&quot; etc.
    */
    public static void largestinColumns(int[][] matrix)
    {
        for(int j=0; j<matrix[0].length; j++){
            int colMax = matrix[0][j];
            for(int i=0; i<matrix.length; i++){
                if(matrix[i][j] > colMax)
                    colMax = matrix[i][j];
            }
            System.out.println("The largest value in column " + j + " is " + colMax);
        }
    }

    /*
    * #8 Write a method that checks if the array is a square matrix

    * A square matrix has the same number of rows and columns!
    */
    public static boolean isSquare(int[][] matrix)
    {
        if (matrix.length == matrix[0].length)
            return true;
        else
            return false;
    }
    /*
    * #9 Write a method that checks if the array is &quot;row-magic&quot;, which means
    * that every row has the same row sum. You will need to change the values of
    * the test array in the main method to do this.
    */
    public static boolean isRowMagic(int[][] matrix)
    {
        boolean rowMagic = true;
        int firstRow = 0;
        for(int j=0; j<matrix[0].length; j++){
            firstRow+=matrix[0][j];
        }
        for(int i=1; i<matrix.length; i++){
            int rowSum = 0;
            for(int j=0; j<matrix[0].length; j++){
                rowSum+=matrix[i][j];
            }
            if(rowSum != firstRow){
                i=matrix.length;
                rowMagic = false;
            }
        }
        return rowMagic;
    }
    /*
    * #9 Write a method that checks if the array is &quot;column-magic&quot;, which means
    * that every column has the same sum. You will need to change the values of
    * the test array in the main method to do this.
    */
   public static boolean isColumnMagic(int[][] matrix)
   {
       boolean colMagic = true;
       int firstCol = 0;
       for(int i=0; i<matrix.length; i++){
            firstCol+=matrix[i][0];
        }
       for(int j=1; j<matrix[0].length; j++){
            int colSum = 0;
            for(int i=0; i<matrix.length; i++){
                colSum+=matrix[i][j];
            }
            if(colSum != firstCol){
                j=matrix[0].length;
                colMagic = false;
            }
        }
       return colMagic;
    }
    /*
    * EXTENSION METHOD:

    * #11 Write a method to determine if the array is a magic square, which
    * means its row sums are equal, its column sums are equal, AND the sum of
    * its diagonals are equal. You could use the methods above as &quot;helper&quot;
    * methods!
    */
   public static boolean isMagic(int[][] matrix)
   {
       if(isSquare(matrix) == true && isRowMagic(matrix) == true && isColumnMagic(matrix) == true){
           int diag1=0;
           int diag2=0;
           for(int k=0; k<matrix.length; k++){
               diag1 += matrix[k][k];
               diag2 += matrix[k][matrix.length-1-k];
            }
           if(diag1==diag2){
                return true;
            }else{
                return false;
            }
        }else{
           return false;
        }
    }
    /*
    * EXTENSION METHOD:
    * #12 Write a method that checks to see if the array is a Latin square.
    * A Latin square has the same # of rows and columns, which must contain
    * the same values 1, 2, ..., n with no repeats. Examples:
    * 123
    * 123
    * 123
    *
    * 56
    * 56
    */
   public static boolean isLatin(int[][] a)
   {
       return false;

    }
}