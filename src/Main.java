import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- != 0) {
            String str = sc.next();
            System.out.println(new Main().solution(str));
        }
    }

    private String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

//    private String solution(String str) {
//        String answer = "";
//
//        char[] c = str.toCharArray();
//        int len = c.length;
//        for (int i = 0; i < len / 2; i++) {
//            char tmp = c[i];
//            c[i] = c[len - 1 - i];
//            c[len - 1 - i] = tmp;
//        }
//
//        answer = String.valueOf(c);
//        return answer;
//    }
}