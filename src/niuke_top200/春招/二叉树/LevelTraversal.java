package niuke_top200.春招.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelTraversal {

    public static void main(String[] args) {

    }


    public ArrayList<ArrayList<Integer>> levelTraversal(DeepTraversal.TreeNode root){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Queue<DeepTraversal.TreeNode> queue = new LinkedList<>();

        if(root == null) return lists;
        queue.offer(root);
        while(queue.size() > 0){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while(size > 0){
                DeepTraversal.TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                size--;
            }
            lists.add(list);
        }
        return lists;
    }




    public ArrayList<Integer> levelTraversal2(DeepTraversal.TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<DeepTraversal.TreeNode> queue = new LinkedList<>();
        if(root == null) return list;
        queue.offer(root);
        while(queue.size() > 0){
            DeepTraversal.TreeNode node = queue.poll();
            list.add(node.val);

            if(root.left != null){
                queue.offer(node.left);
            }
            if(root.right != null){
                queue.offer(node.right);
            }
        }
        return list;
    }



}
