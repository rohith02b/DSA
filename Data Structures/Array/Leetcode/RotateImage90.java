class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<=i;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int k=0;

        for(int i=0;i<matrix.length;i++) {
            for(int j=matrix.length-1;j>=matrix.length/2;j--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                k++;
            }
            k=0;
        }

    }
}