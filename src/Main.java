import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new Main().solution(str));
    }

    private String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == str.indexOf(c)) {
                answer += c;
            }
        }

        return answer;
    }

//    private String solution(String str) {
//        boolean alpha[] = new boolean[26];
//        String answer = "";
//
//        for (char c : str.toCharArray()) {
//            if(!alpha[c - 'a']) {
//                alpha[c - 'a'] = true;
//                answer += c;
//            }
//        }
//        return answer;
//    }

}