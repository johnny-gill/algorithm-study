import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new Main().solution(str));
    }

    private String solution(String str) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')'){
                stack.pop();
            } else if (stack.empty()) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}