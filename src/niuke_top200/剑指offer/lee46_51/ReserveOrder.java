package niuke_top200.剑指offer.lee46_51;

import java.util.ArrayList;
import java.util.List;

public class ReserveOrder {

    public static void main(String[] args) {

    }

    int result = 0;
    List<Integer> list = new ArrayList<>();
    public int reserveOrder(int[] nums){
        reserveTransfor(nums, 2, 0);
        return result;
    }


    private void reserveTransfor(int[] nums, int k, int startIndex) {
        if(list.size() == 2){
            if(list.get(0) > list.get(1)){
                result++;
                return;
            }
        }

        for (int i = startIndex; i < nums.length; i++) {
            list.add(nums[i]);
            reserveTransfor(nums, k, i + 1);
            list.remove(list.size() - 1);
        }
    }

}

// 笑死：回溯的本质就是穷举，遍历。
// 这道题k==2，不需要回溯直接两层遍历就结束的事情，无语子。

