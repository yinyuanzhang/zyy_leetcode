package niuke_top200.剑指offer.lee59_63;

import java.util.HashSet;

public class PlayCards {

    public static void main(String[] args) {

    }

    public boolean isContinus(int[] arr){
        int max = 0;
        int min = 14;

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(num == 0) continue;
            if(set.contains(num)) return false;
            else set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min < 5 ? true : false;
    }
}
