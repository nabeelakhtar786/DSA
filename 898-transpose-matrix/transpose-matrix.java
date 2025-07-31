class Solution{
    public int[][] transpose(int[][] matrix)
    { int i,j;
int r = matrix.length;
int c = matrix[0].length;
int output[][]= new int[c][r]; 
for(i =0; i < r; i++)
    for(j=0; j < c; j++)
        output[j][i]=matrix[i][j];

    return output;

    }
}


















// class Solution {
//     public static int[][] transpose(int[][] matrix) {
//         int m = matrix.length;       // number of rows
//         int n = matrix[0].length;    // number of columns
        
//         int[][] transpose = new int[n][m];  // transpose will have dimensions n x m
        
//         for (int i = 0; i < m; i++) {          // iterate over rows
//             for (int j = 0; j < n; j++) {      // iterate over columns
//                 transpose[j][i] = matrix[i][j];
//             }
//         }
//         return transpose;
//     }
// }
