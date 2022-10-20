import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int K = sc.nextInt();
        int[] moves = new int[K];
        for (int i = 0; i < K; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(new Main().solution(N, board, K, moves));
    }

    private int solution(int N, int[][] board, int K, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < K; i++) {
            int column = moves[i] - 1;
            for (int j = 0; j < N; j++) {

                int num = board[j][column];
                if (num != 0) {
                    if (!stack.empty() && num == stack.peek()) {
                        cnt += 2;
                        stack.pop();
                    } else {
                        stack.push(num);
                    }
                    board[j][column] = 0;
                    break;
                }
            }
        }

        return cnt;
    }
}