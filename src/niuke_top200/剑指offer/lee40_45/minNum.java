package niuke_top200.剑指offer.lee40_45;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class minNum {

    public static void main(String[] args) {

    }

    public String minNum(int[] nums){
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });

        for (int i = 0; i < nums.length; i++) {
            queue.offer("" + nums[i]);
        }

        StringBuffer sb = new StringBuffer();
        while(queue.size() > 0){
            sb.append(queue.poll());
        }
        return sb.toString();

    }
}


// 这个字典序的比较有点小天秀。