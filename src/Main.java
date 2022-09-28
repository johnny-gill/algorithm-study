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
        int sum = 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isTop = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if (arr[i][j] <= arr[nx][ny]) {
                        isTop = false;
                        break;
                    }
                }

                if (isTop) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}