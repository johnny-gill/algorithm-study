import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        new Main().solution(N, M, arr);
    }

    private void solution(int N, int M, int[][] arr) {
        boolean[][] student = new boolean[M + 1][M + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = j + 1; k < M; k++) {
                    int left = arr[i][j];
                    int right = arr[i][k];
                    if (!student[left][right]) {
                        student[left][right] = true;
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= M; j++) {
                if (student[i][j] && !student[j][i]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}