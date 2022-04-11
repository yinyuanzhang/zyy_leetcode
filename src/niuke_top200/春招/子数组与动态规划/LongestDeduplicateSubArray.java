package niuke_top200.春招.子数组与动态规划;

import java.util.HashMap;


// 细节注意：1.双指针的right是变量而非常量。 2.
public class LongestDeduplicateSubArray {

    public static void main(String[] args) {

    }

    public static int longestDeduplicateSubArray(int[] array){

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < array.length; right++) {
            if(map.containsKey(array[right])){
                left = Math.max(left, map.get(array[right]) + 1);
            }
            map.put(array[right], right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    }
}
