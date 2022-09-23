import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Main().solution(str));
    }

    private String solution(String str) {

        String answer = "";
        int max = Integer.MIN_VALUE;

        for (String s : str.split(" ")) {
            int length = s.length();
            if (length > max) {
                max = length;
                answer = s;
            }
        }

        return answer;
    }

//    private String solution(String str) {
//
//        String answer = "";
//        int max = Integer.MIN_VALUE;
//
//        int pos = 0;
//        while ((pos = str.indexOf(" ")) != -1) {
//            String tmp = str.substring(0, pos);
//            int length = tmp.length();
//            if (max < length) {
//                max = length;
//                answer = tmp;
//            }
//
//            str = str.substring(pos + 1);
//        }
//
//        if (max < str.length()) {
//            answer = str;
//        }
//
//        return answer;
//    }
}
