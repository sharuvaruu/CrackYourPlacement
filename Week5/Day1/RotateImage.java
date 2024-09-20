class Solution {
    public void rotate(int[][] matrix) {
        // Matrix ki length ko n se store kar rahe hain
        int n = matrix.length;

        // Step 1: Matrix ka transpose karna
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // matrix[i][j] ko matrix[j][i] ke sath swap kar rahe hain
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Har row ko reverse karna
        for (int i = 0; i < n; i++) {
            // ith row ko reverse kar rahe hain
            for (int j = 0; j < n / 2; j++) {
                // matrix[i][j] ko matrix[i][n - 1 - j] ke sath swap kar rahe hain
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
