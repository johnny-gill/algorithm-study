import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new Main().solution(s));
    }

    private String solution(String s) {
        s += " ";
        String answer = "";
        char beforeChar = s.charAt(0);
        int sum = 1;

        for (int i = 1; i < s.length(); i++) {
            if (beforeChar == s.charAt(i)) {
                sum++;
            } else {
                answer += beforeChar + "" + ((sum == 1) ? "" : sum);
                sum = 1;
                beforeChar = s.charAt(i);
            }
        }

        return answer;
    }
}