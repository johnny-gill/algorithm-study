import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(new Main().solution(N, K, arr));

    }

    private int solution(int N, int K, int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    treeSet.add(sum);
                }
            }
        }

        int cnt = 0;
        for (Integer x : treeSet) {
            cnt++;
            if (cnt == K) return x;
        }

        return -1;
    }
}