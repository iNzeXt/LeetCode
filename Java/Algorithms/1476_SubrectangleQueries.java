package leetcode.algorithms;

/**
 *  @problemNumber 1476
 *  @source https://leetcode.com/problems/subrectangle-queries/
 *  @difficulty medium
 *  @author iNzeXt
 *  @date 31/08/2021
 *  
 *  Implement the class SubrectangleQueries which receives a rows x cols rectangle as a
 *  matrix of integers in the constructor and supports two methods:
 *
 *	1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
 *			Updates all values with newValue in the subrectangle whose upper left coordinate is (row1,col1) 
 *			and bottom right coordinate is (row2,col2).
 *
 *	2. getValue(int row, int col)
 *			Returns the current value of the coordinate (row,col) from the rectangle.
 *
 */
public class SubrectangleQueries {

    private int[][] rectangle;
	
    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++) {
        	for(int j = col1; j <= col2; j++) {
        		rectangle[i][j] = newValue;
        	}
        }
    }
    
    public int getValue(int row, int col) {
        return rectangle[row][col];
    }	
    
    public int[][] getRectangle() {
	return rectangle;
    }

}
