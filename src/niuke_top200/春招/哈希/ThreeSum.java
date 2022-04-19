package niuke_top200.春招.哈希;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


// 一个数固定后，另外还有两个数用双指针确实方便一些
public class ThreeSum {

// 排序+双指针
// 针对重复数字的两个写法: 注意边界条件，while写法也很奇特
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> threeSum(int[] num){
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            if(num[i] > 0) break;   // 这个算是优化
            if(i > 0 && num[i] == num[i - 1]) continue;   // 这个写法我咋不会用呢? 这么笨。好几次了。

            int j = i + 1;
            int k = num.length - 1;
            while(j < k){
                int sum = num[i] + num[j] + num[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    lists.add(new ArrayList<>(Arrays.asList(num[i], num[j], num[k])));
                    while(j < k && num[j] == num[++j]);
                    while(j < k && num[k] == num[--k]);
                }
            }
        }

        return lists;
    }




}
