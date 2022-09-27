import java.util.Scanner;

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
        System.out.print(arr[0] + " ");
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}