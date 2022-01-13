package niuke_top200.剑指offer.lee30_33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelTrans02 {

    public static void main(String[] args) {

    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public List<List<Integer>> levelTrans02(TreeNode root){
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return lists;
        queue.offer(root);

        while(queue.size() > 0){
            int length = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while(length > 0) {
                length--;
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
