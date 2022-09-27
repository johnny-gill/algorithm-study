import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(new StringBuilder(sc.next()).reverse().toString());
            arr[i] = num;
            max = Math.max(max, num);
        }

        new Main().solution(n, arr, max);
    }

    private void solution(int n, int[] arr, int max) {
        boolean[] prime = new boolean[max + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= max; i++) {
            if (!prime[i]) {
                for (int j = i; j <= max; j+=i) {
                    if (i == j) continue;
                    prime[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!prime[arr[i]]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}