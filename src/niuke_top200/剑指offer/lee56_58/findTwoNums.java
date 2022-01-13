package niuke_top200.剑指offer.lee56_58;

import java.util.HashMap;

public class findTwoNums {

    public static void main(String[] args) {

    }

    public int[] findTwoNums(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{target - nums[i], nums[i]};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
