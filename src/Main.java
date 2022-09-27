import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        new Main().solution(n, arr);
    }

    private void solution(int n, int[][] arr) {
        for (int j = 0; j < n; j++) {
            int a = arr[0][j];
            int b = arr[1][j];

            if (a == b) {
                System.out.println("D");
            } else if ((a == 2 && b == 1) || (a == 1 && b == 3) || (a == 3 && b == 2)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}