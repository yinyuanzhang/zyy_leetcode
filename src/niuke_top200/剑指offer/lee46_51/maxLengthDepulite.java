package niuke_top200.剑指offer.lee46_51;

import java.util.HashMap;

public class maxLengthDepulite {


    public static void main(String[] args) {

    }

    public int maxLengthDepulite(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            if(right - left + 1 > max){
                max = right - left + 1;
            }
            map.put(s.charAt(right), right);
        }
        return max;
    }
}
