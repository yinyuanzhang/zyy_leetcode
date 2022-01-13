package niuke_top200.笔试.百度;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < num; i++) {
            String number = sc.nextLine();
            System.out.println(calF(number));
        }
    }


    public static String calF(String s){
        if(s.length() >= 31) return s;
        while(!isValidNum(s)){
            int a = Integer.valueOf(s);
            a--;
            s = String.valueOf(a);
        }
        return s;

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) >= '0' && s.charAt(i) <= '3'){
//                sb.append(s.charAt(0));
//            }else{
//                sb.append('3');
//            }
//        }
//        return sb.toString();
    }

    private static boolean isValidNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > '3' || s.charAt(i) < '0'){
                return false;
            }
        }
        return true;
    }


}
