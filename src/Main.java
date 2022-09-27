import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Main().solution(n));
    }

    private int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                answer++;
                for (int j = i; j <= n; j+=i) {
                    prime[j] = true;
                }
            }
        }

        return answer;
    }
}