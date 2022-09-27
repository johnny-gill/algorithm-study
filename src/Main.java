import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(new Main().solution(n, arr));
    }

    private int solution(int n, int[] arr) {
        int answer = 1;
        int maxHeight = arr[0];
        for (int i = 1; i < n; i++) {
            if (maxHeight < arr[i]) {
                maxHeight = arr[i];
                answer++;
            }
        }

        return answer;
    }
}