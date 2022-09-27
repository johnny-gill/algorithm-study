import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new Main().solution(n);
    }

    private void solution(int n) {
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;

        System.out.print("1 1 ");
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            System.out.print(arr[i] + " ");
        }
    }
}