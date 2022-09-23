import java.util.Scanner;

public class p0101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char chr = sc.next().charAt(0);

        System.out.println(new p0101().solution(str, chr));
    }

    private int solution(String str, char chr) {

        str = str.toLowerCase();
        chr = Character.toLowerCase(chr);

        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c == chr) {
                answer++;
            }
        }

        return answer;
    }
}
