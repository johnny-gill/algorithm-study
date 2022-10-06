import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        new Main().solution(N, M, arr);
    }

    private void solution(int N, int M, int[] arr) {
        int answer, sum, lt;
        answer = sum = lt = 0;

        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];

            if (sum == M) {
                answer++;
            }

            while (sum >= M) {
                sum -= arr[lt++];
                if (sum == M) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}