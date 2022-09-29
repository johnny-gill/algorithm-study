import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }

        new Main().solution(N, M, a, b);
    }

    private void solution(int N, int M, int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        int aIdx = 0;
        int bIdx = 0;

        while (true) {
            if (N == aIdx) {
                for (int i = bIdx; i < M; i++) {
                    list.add(b[bIdx++]);
                }
                break;
            }

            if (M == bIdx) {
                for (int i = aIdx; i < N; i++) {
                    list.add(a[aIdx++]);
                }
                break;
            }

            if (a[aIdx] < b[bIdx]) {
                list.add(a[aIdx++]);
            } else {
                list.add(b[bIdx++]);
            }
        }

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}