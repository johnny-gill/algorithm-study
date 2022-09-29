import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        List<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int aIdx = 0;
        int bIdx = 0;

        while(aIdx != N && bIdx != M) {
            if (a[aIdx] == b[bIdx]) {
                answer.add(a[aIdx]);
                aIdx++;
                bIdx++;
            } else if (a[aIdx] < b[bIdx]) {
                aIdx++;
            } else {
                bIdx++;
            }
        }

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}