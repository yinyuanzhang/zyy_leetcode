package niuke_top200.春招.图;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


// 拓扑排序用BFS的方式是正向逻辑，获取排序结果要方便很多，和判断有向图中有无环区别不大。
public class OrderCourse {

    public static void main(String[] args) {

    }

    public int[] orderCourse(int numCourses, int[][] prerequisites){
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            lists.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for(int[] singleReq : prerequisites){
            inDegree[singleReq[0]]++;
            lists.get(singleReq[1]).add(singleReq[0]);
        }

        int[] result = new int[numCourses];
        int index = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) queue.offer(i);
        }
        while(queue.size() != 0){
            int pre = queue.poll();
            result[index++] = pre;
            for(int cur : lists.get(pre)){
                if(--inDegree[cur] == 0) queue.offer(cur);
            }
        }
        return numCourses == index ? result : new int[0];
    }
}
