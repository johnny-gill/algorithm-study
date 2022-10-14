import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        new Main().solution(s, t);
    }

    private void solution(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        int cnt = 0;
        int lt = 0;
        int tLength = t.length();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int rt = 0; rt < s.length(); rt++) {
            tMap.put(s.charAt(rt), tMap.getOrDefault(s.charAt(rt), 0) + 1);
            if (rt - lt + 1 == tLength) {
                if (sMap.equals(tMap)) {
                    cnt++;
                }

                tMap.put(s.charAt(lt), tMap.get(s.charAt(lt)) - 1);
                if (tMap.get(s.charAt(lt)) == 0) {
                    tMap.remove(s.charAt(lt));
                }
                lt++;
            }
        }

        System.out.println(cnt);
    }
}