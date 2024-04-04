public class matrixChainMul {
    public static void main(String[] args) {
        int[] dimensions = {4,5,6,7,8,9}; 
        int n = dimensions.length - 1; 

        int[][] minMultiplications = new int[n + 1][n + 1]; 
        int[][] splitIndex = new int[n + 1][n + 1]; 

        matrixChainOrder(dimensions, n, minMultiplications, splitIndex);

        System.out.println("Minimum number of multiplications needed: " + minMultiplications[1][n]);
        
        System.out.println("Matrix of Minimum Multiplications:");
        printMatrix(minMultiplications);
        
        System.out.println("Matrix of Split Indices:");
        printMatrix(splitIndex);
        
        System.out.println("Optimal parenthesization:");
        printOptimalParenthesis(splitIndex, 1, n);
    }

    private static void matrixChainOrder(int[] p, int n, int[][] m, int[][] s) {
        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;
        }

        for (int L = 2; L <= n; L++) {
            for (int i = 1; i <= n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printOptimalParenthesis(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
        } else {
            System.out.print("(");
            printOptimalParenthesis(s, i, s[i][j]);
            printOptimalParenthesis(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }
}