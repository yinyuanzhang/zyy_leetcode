package niuke_top200.笔试.美团;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < num; i++) {
            if(isPerfect(sc.nextLine())) System.out.println("YES");
            else System.out.println("NO");
        }
    }


    private static boolean isPerfect(String str) {
        int[] used = new int[str.length()];
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        order(str, used, set, sb);
        for(String st : set){
            if(!isVaild(st)) return true;
        }
        return false;
    }

    private static boolean isVaild(String st) {
        int left = 0;
        int right = st.length() - 1;
        while(left < right){
            if(st.charAt(left++) != st.charAt(right--)) return false;
        }
        return true;
    }

    private static void order(String str, int[] used, HashSet<String> set, StringBuilder sb) {
        if(sb.length() == str.length()){
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if(used[i] == 1) continue;

            used[i] = 1;
            sb.append(str.charAt(i));
            order(str, used, set, sb);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = 0;
        }
    }

}
