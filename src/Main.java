import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new Main().solution(str));
    }

    private String solution(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()) ? "YES" : "NO";
    }

//    private String solution(String str) {
//        String answer = "YES";
//
//        str = str.toLowerCase();
//        int len = str.length() / 2;
//        int back = str.length() - 1;
//        for (int i = 0; i < len; i++) {
//            if (str.charAt(i) != str.charAt(back - i)) {
//                answer = "NO";
//                break;
//            }
//        }
//
//        return answer;
//    }

}