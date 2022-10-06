import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        new Main().solution(N);
    }

    private void solution(int N) {
        int answer = 0;
        int lt = 1;
        int sum = 0;
        N = N/2 + 1;

        for (int rt = 1; rt < N; rt++) {
            sum += rt;

            if (sum == N) {
                answer++;
                sum -= lt++;
            }

            while (sum > N) {
                sum -= lt++;

                if (sum == N) {
                    answer++;
                    sum -= lt++;
                }
            }
        }

        System.out.println(answer);
    }
}