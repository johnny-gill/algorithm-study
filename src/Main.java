import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(new Main().solution(str));
    }

    private String solution(String str) {

        char[] chars = str.toCharArray();
        int leftIdx = 0;
        int rightIdx = str.length() - 1;

        while(leftIdx < rightIdx) {
            if (!Character.isLetter(chars[leftIdx])) {
                leftIdx++;
            } else if (!Character.isLetter(chars[rightIdx])) {
                rightIdx--;
            } else {
                char tmp = chars[leftIdx];
                chars[leftIdx] = chars[rightIdx];
                chars[rightIdx] = tmp;
                leftIdx++;
                rightIdx--;
            }
        }

        return String.valueOf(chars);
    }

}