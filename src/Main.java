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

        boolean[] check = new boolean[301];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (!check[sum]) {
                        check[sum] = true;
                        list.add(sum);
                    }
                }
            }
        }

        list.sort(Comparator.reverseOrder());
        System.out.println((list.size() < K) ? -1 : list.get(K - 1));
    }
}