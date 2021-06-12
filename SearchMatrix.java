/**
 * @author Vishal Puri
 * // Time Complexity : O(m+n)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int m=matrix.length, n=matrix[0].length;
        int p1=0, p2=matrix[0].length-1;
        for(int i=0; i<m+n-1; i++){
            if(p1<=m-1 && p2>=0 && matrix[p1][p2]==target) return true;
            if(p1<=m-1 && p2>=0 && matrix[p1][p2]<target){
                p1++;
            } else if(p2>=0){
                p2--;
            }
        }
        if(matrix[matrix.length-1][0]== target)
            return true;
        return false;
    }
}
