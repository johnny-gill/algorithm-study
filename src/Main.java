import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        new Main().solution(n, arr);
    }

    private void solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];

                if (i == j) {
                    leftDiagonalSum += arr[i][j];
                }

                if (i == j - n + 1) {
                    rightDiagonalSum += arr[i][j];
                }
            }
            max = Integer.max(max, rowSum);
            max = Integer.max(max, colSum);
        }
        max = Integer.max(max, leftDiagonalSum);
        max = Integer.max(max, rightDiagonalSum);

        System.out.println(max);
    }
}