package niuke_top200.剑指offer.lee30_33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelTrans01 {


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

    public ArrayList<Integer> levelTrans01(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return list;
        queue.offer(root);
        while(queue.size() > 0){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(root.left != null){
                queue.offer(root.left);
            }
            if(root.right != null){
                queue.offer(root.right);
            }
        }
        return list;
    }
}
