package niuke_top200.排列组合;

import java.util.ArrayList;
import java.util.List;

public class Arrange {

    public static void main(String[] args) {

    }

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> arrange(int[] nums){
        boolean[] used = new boolean[nums.length];
        backTransfor(nums, used);
        return result;
    }

    private void backTransfor(int[] nums, boolean[] used) {
        int length = nums.length;
        if(list.size() == length){
            result.add(new ArrayList<>(list));
            return;
        }
        // return总是忘记！记得提前终止！
        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true){
                continue;
            }

            list.add(nums[i]);
            used[i] = true;
            backTransfor(nums, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }

}
