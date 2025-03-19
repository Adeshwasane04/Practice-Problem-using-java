package TwodARRAYS;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(printSpiralMatrix(matrix));
    }

    static String printSpiralMatrix(int[][] matrix) {
        // Using StringBuilder for better performance with string concatenation
        StringBuilder output = new StringBuilder();

        // Boundaries
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        // Spiral traversal
        while (startRow <= endRow && startCol <= endCol) {
            // Traverse from left to right across the top row
            for (int i = startCol; i <= endCol; i++) {
                output.append(matrix[startRow][i]).append(" ");
            }

            // Traverse from top to bottom along the right column
            for (int j = startRow + 1; j <= endRow; j++) {
                output.append(matrix[j][endCol]).append(" ");
            }

            // Traverse from right to left across the bottom row (if needed)
            if (startRow < endRow) {
                for (int k = endCol - 1; k >= startCol; k--) {
                    output.append(matrix[endRow][k]).append(" ");
                }
            }

            // Traverse from bottom to top along the left column (if needed)
            if (startCol < endCol) {
                for (int l = endRow - 1; l > startRow+1; l--) {
                    output.append(matrix[l][startCol]).append(" ");
                }
            }

            // Move the boundaries inward
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        // Convert StringBuilder to String and return, trimming any trailing space
        return output.toString().trim();
    }
}
