import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new Main().solution(str));
    }

    private String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            answer += Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
        }

//        int alphabetDiff = 'A' - 'a';
//        for (char c : str.toCharArray()) {
//            if ('A' <= c && c <= 'Z') {
//                answer += (char) (c - alphabetDiff);
//            } else {
//                answer += (char) (c + alphabetDiff);
//            }
//        }

        return answer;
    }
}
