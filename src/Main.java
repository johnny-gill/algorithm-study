import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for (int i : new Main().solution(s, t)) {
            System.out.print(i + " ");
        }

    }

//    teachermode e
//    edomrehcaet e
//    1 0 1 2 1 0 1 2 2 1 0
    private int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        boolean findLeftIndex = false;
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                rightIndex = i + 1;
                leftIndex = i;
                findLeftIndex = true;
            } else {
                if (!findLeftIndex) { // 왼쪽에 t가 없으면 오른쪽 t와의 거리 계산
                    answer[i] = s.indexOf(t, rightIndex) - i;
                } else if (s.indexOf(t, rightIndex) == -1) { // 오른쪽에 t가 없으면 왼쪽 t와의 거리 계산
                    answer[i] = i - leftIndex;
                } else {
                    answer[i] = Math.min(i - leftIndex, s.indexOf(t, rightIndex) - i);
                }
            }
        }
        return answer;
    }


}