package niuke_top200.子数组;
import java.util.HashMap;

public class longestDeduplicatedArr {

    public static int longestDeduplicatedArr(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int right = 0; right < arr.length; right++){
            if(map.containsKey(arr[right])){
                left = Math.max(left,map.get(arr[right]) + 1);
            }
            map.put(arr[right],right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
