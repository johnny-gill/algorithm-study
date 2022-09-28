import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        new Main().solution(n, arr);
    }

    private void solution(int n, int[] arr) {
        int[] answer = new int[n]{1,1,1,1,1};

        for (int i = 0; i < n; i++) {
            answer[i] = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    answer[i]++;
                }
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}