package niuke_top200.剑指offer.lee52_55;

import java.util.ArrayList;
import java.util.List;

public class MaxKInSearchTree {

    public class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val){
            this.val = val;
        }
    }

    List<Integer> list = new ArrayList<>();
    public int maxKInSearchTree(TreeNode root, int k){
        if(root == null) return -1;
        transTreeNode(root, k);
        return list.get(list.size() - k);
    }

    private void transTreeNode(TreeNode root, int k) {
        if(root == null) return;
        transTreeNode(root.left, k);
        list.add(root.val);
        transTreeNode(root.right, k);
    }

}
