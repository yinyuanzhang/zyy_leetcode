package niuke_top200.剑指offer.lee46_51;

import java.util.HashMap;

public class firstOnceChar {

    public static void main(String[] args) {

    }

    public char firstOnceChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);;
            }
            map.put(s.charAt(i), 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
