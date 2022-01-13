package niuke_top200.笔试.美团;

import java.util.HashMap;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        int num = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < num; i++) {
            int n = Integer.valueOf(sc.nextLine());
            String s  = sc.nextLine();
            System.out.println(contentCreate(s, n, map));
        }
    }


    private static String contentCreate(String s, int n, HashMap<Character, String> map) {
        StringBuilder sb = new StringBuilder();

        int tag = 0;
        boolean ingored = false;
        int times = 0;
        if (s.charAt(0) == '0') {
            sb.append('-');
            ingored = true;
        } else if (s.charAt(0) == '-') {
            times++;
        }

        for (int i = 1; i < n; i++) {
            if (ingored) {
                if (s.charAt(i) == '0') {
                    sb.append('-');
                    ingored = true;
                    tag = 0;
                }
            } else {
                if (s.charAt(i) == '0') {
                    if (s.charAt(i) != '-') {
                        char ch = s.charAt(i - 1);
                        String values = map.get(ch);
                        char val = values.charAt(tag % (values.length()));
                        sb.append(val);
                        tag = 0;
                    }
                    sb.append('-');
                    ingored = true;
                    tag = 0;
                } else if (s.charAt(i) == '-') {
                    times++;
                    if (times == 2) {
                        ingored = true;
                        tag = 0;
                    }
                } else if (s.charAt(i) == s.charAt(i - 1)) {
                    tag++;
                } else {
                    char ch = s.charAt(i - 1);
                    String values = map.get(ch);
                    char val = values.charAt(tag % (values.length()));
                    sb.append(val);
                    tag = 0;
                }
                ingored = true;
            }
        }

        char ch = s.charAt(n - 1);
        if(ch == '0') {
            sb.append('-');
        }else{
            String values = map.get(ch);
            char val = values.charAt(tag%(values.length()));
            sb.append(val);
        }
        return sb.toString();
    }

}
