package RecursionAssignment;

public class NQueen {
	
    /*
	 * Display the matrix having possible queen places
	 * @param 2-D array having queen places
	 */
    public static void printSolution(int board[][]) 
    { 
        for (int i = 0; i < board.length; i++) { 
            for (int j = 0; j < board.length; j++) 
                System.out.print(" " + board[i][j] 
                                 + " "); 
            System.out.println(); 
        } 
    } 
    /*
	 * checking if next location is safe or not
	 * 
	 * @param 2-D array that contains queens places
	 * 
	 * @param row
	 * 
	 * @param col
	 * 
	 * @return true if safe else false
	 */
    public static boolean isSafe(int board[][], int row, int col) 
    { 
        int i, j; 
        for (i = 0; i < col; i++)   //horizontally element checking
            if (board[row][i] == 1) 
                return false; 
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) //upper left diagonal elements checking
            if (board[i][j] == 1) 
                return false; 
        for (i = row, j = col; j >= 0 && i < board.length; i++, j--) //lower left diagonal elements checking
            if (board[i][j] == 1) 
                return false; 
  
        return true; 
    } 
    /*
	 * get chess board with queens positions and place queens
	 * 
	 * @param 2-D array that contains queens positions
	 * 
	 * @param col
	 * 
	 * @return true if there is possible solution else false
	 */
    public static boolean solveNQUtil(int board[][], int col) 
    { 
        if (col >= board.length) 
            return true; 
        for (int i = 0; i < board.length; i++) { 
            if (isSafe(board, i, col)) {  
                board[i][col] = 1; 
                if (solveNQUtil(board, col + 1) == true) 
                    return true; 
                board[i][col] = 0; // BACKTRACK 
            } 
        } 
        return false; 
    } 
    public static int[][] getNQueenSolution(int size) {
		int board[][] = new int[size][size];
		if (solveNQUtil(board, 0) == false) { 
        	System.out.print("Solution does not exist"); 
        }
		return board;
	}
    
    public static void main(String args[]) 
    {   
        int [][] result=getNQueenSolution(5);


        printSolution(result); 
        
    } 
} 
