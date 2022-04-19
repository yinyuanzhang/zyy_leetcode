package niuke_top200.春招.哈希;

import java.util.HashMap;


// 注意map中存储的索引即可
public class TwoSum {

    public static void main(String[] args) {

    }


    public int[] twoSum(int[] numbers, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])){
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
            }else{
                map.put(numbers[i], i);
            }
        }

        return new int[]{-1 , -1};
    }

}
