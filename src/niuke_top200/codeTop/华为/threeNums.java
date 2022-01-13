package niuke_top200.codeTop.华为;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeNums {

    public static void main(String[] args) {

    }

    public List<List<Integer>> threeNums(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    while(j < k && nums[j] == nums[++j]);
                    while(j < k && nums[k] == nums[--k]);
                }
            }
        }
        return res;
    }
}


