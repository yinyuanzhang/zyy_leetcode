package niuke_top200.剑指offer.lee34_39;

import java.util.HashMap;

public class FindNum {

    public static void main(String[] args) {

    }

    public int findNum(int[] nums){
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
            if(map.get(num) > length/2){
                return num;
            }
        }
        return -1;
    }
}
