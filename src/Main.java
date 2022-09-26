import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Main().solution(str));
    }

    private String solution(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()) ? "YES" : "NO";
    }
}