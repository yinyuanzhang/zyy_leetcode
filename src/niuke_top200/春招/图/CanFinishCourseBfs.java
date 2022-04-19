package niuke_top200.春招.图;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// 与DFS相比， 多了入度数组，少了visited访问数组
public class CanFinishCourseBfs {

    public static void main(String[] args) {

    }

    public boolean canFinishCourseBfs(int numCourses, int[][] prerequisites){
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            lists.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for(int[] singleReq : prerequisites){
            inDegree[singleReq[0]]++;
            lists.get(singleReq[1]).add(singleReq[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }
        while(queue.size() != 0){
            int pre = queue.poll();
            numCourses--;
            for(int cur: lists.get(pre)){
                if(--inDegree[cur] == 0){
                    queue.offer(cur);
                }
            }
        }
        return numCourses == 0;
    }
}


