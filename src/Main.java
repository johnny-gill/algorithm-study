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
        new Main().solution(N, K, arr);
    }

    private void solution(int N, int K, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int lt = 0;
        for (int rt = 0; rt < N; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

            if (rt - lt + 1 == K) {
                sb.append(map.size());
                sb.append(" ");
                map.put(arr[lt], map.get(arr[lt]) - 1);
                if (map.get(arr[lt]) == 0) {
                    map.remove(arr[lt]);
                }
                lt++;
            }
        }

        System.out.println(sb);
    }

//    private void solution(int N, int K, int[] arr) {
//        int lt = 0;
//        int cnt = 0;
//        List<Integer> list = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int rt = 0; rt < N; rt++) {
//            if (list.contains(arr[rt])) {
//                cnt++;
//            }
//            list.add(arr[rt]);
//
//            if (rt - lt + 1 == K) {
//                sb.append(K - cnt);
//                sb.append(" ");
//                list.remove(lt++);
//                cnt = 0;
//            }
//        }
//
//        System.out.println(sb);
//    }
}