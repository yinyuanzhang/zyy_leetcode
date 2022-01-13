package niuke_top200.剑指offer.lee34_39;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringArrange {

    public static void main(String[] args) {

    }

    List<String> lists = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    HashSet set = new HashSet();
    public String[] stringArrange(String s){
        char[] nums = s.toCharArray();
        boolean[] used = new boolean[nums.length];
        backTransfor(nums, used);
        String[] result = new String[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            result[i] = lists.get(i);
        }
        return result;
    }

    private void backTransfor(char[] nums, boolean[] used) {
        int length = nums.length;
        if(sb.length() == length && !set.contains(sb.toString())){
            set.add(sb.toString());
            lists.add(sb.toString());
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i] == true) continue;
            sb.append(nums[i]);
            used[i] = true;
            backTransfor(nums, used);
            used[i] = false;
            sb.delete(sb.length() - 1, sb.length());
        }
    }
}

// 全排列不一样的地方：可能有重复值