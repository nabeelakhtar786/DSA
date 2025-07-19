class Solution {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns
        
        int[][] transpose = new int[n][m];  // transpose will have dimensions n x m
        
        for (int i = 0; i < m; i++) {          // iterate over rows
            for (int j = 0; j < n; j++) {      // iterate over columns
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
