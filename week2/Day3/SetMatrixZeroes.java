class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length; // Matrix ki rows ka count
        int c = matrix[0].length; // Matrix ki columns ka count

        int[] row = new int[r]; // Row tracking array, jo har row ko zero hone ka track rakhega
        int[] col = new int[c]; // Column tracking array, jo har column ko zero hone ka track rakhega

        // Pehle pass me matrix ko check karte hain aur zero elements ke liye row aur column arrays ko mark karte hain
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) { // Agar current element zero hai
                    row[i] = 1; // Toh us row ko mark kar do
                    col[j] = 1; // Aur us column ko bhi mark kar do
                }
            }
        }

        // Ab matrix ko update karenge row aur column tracking arrays ke basis pe
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1) { // Agar current row ya column marked hai
                    matrix[i][j] = 0; // Toh current element ko zero set kar do
                }
            }
        }

        // Note: "row[i]=0" line comment kiya hua hai, isse matrix ke rows ko zero se fill karne ka process optimize ho sakta hai
    }
}
