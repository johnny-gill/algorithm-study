import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Main().solution(str));
    }

    private Integer solution(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }
}