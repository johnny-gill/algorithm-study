import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(new Main().solution(str));

    }

    private int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                Integer backNum = stack.pop();
                Integer frontNum = stack.pop();

                if (c == '+') {
                    stack.push(frontNum + backNum);
                } else if (c == '-') {
                    stack.push(frontNum - backNum);
                } else if (c == '*') {
                    stack.push(frontNum * backNum);
                } else if (c == '/') {
                    stack.push(frontNum / backNum);
                }
            }
        }

        return stack.pop();
    }
}