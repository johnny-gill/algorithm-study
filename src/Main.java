import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(new Main().solution(n, s));
    }

    private String solution(int n, String s) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            s = s.substring(7);
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
        }

        return answer;
    }

//    private String solution(int n, String s) {
//        String answer = "";
//
//        for (int i = 0; i < n; i++) {
//            String tmp = s.substring(0, 7);
//            s = s.substring(7);
//
//            int decimal = 0;
//            for (int j = 0; j < 7; j++) {
//                if (tmp.charAt(j) == '#') {
//                    decimal += Math.pow(2, 6 - j);
//                }
//            }
//            answer += (char) decimal;
//        }
//
//        return answer;
//    }
}