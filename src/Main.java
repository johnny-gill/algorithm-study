import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        new Main().solution(N, str);
    }

//    private void solution(int n, String str) {
//        int[] arr = new int[5];
//
//        for (char c : str.toCharArray()) {
//            arr[c - 'A']++;
//        }
//
//        int max = 0;
//        int answer = 0;
//        for (int i = 0; i < 5; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//                answer = i;
//            }
//        }
//
//        System.out.println(Character.toChars(answer + 'A'));
//    }

    private void solution(int n, String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char answer = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int curVal = entry.getValue();
            if (max < curVal) {
                max = curVal;
                answer = entry.getKey();
            }
        }

        System.out.println(answer);
    }
}