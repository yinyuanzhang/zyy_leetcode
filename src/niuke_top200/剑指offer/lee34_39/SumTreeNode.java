package niuke_top200.剑指offer.lee34_39;

import java.util.ArrayList;
import java.util.List;

public class SumTreeNode {


    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> SumTreeNode(TreeNode root, int target){
        transTreeNode(root, target, 0, list);
        return lists;
    }

    private void transTreeNode(TreeNode root, int target, int currSum, List<Integer> list) {
        if(root == null) return;

        currSum += root.val;
        //if(currSum > target) return;
        list.add(root.val);
        if(currSum == target && root.left == null && root.right == null){
            lists.add(new ArrayList<>(list));
        }
        transTreeNode(root.left, target, currSum, list);
        transTreeNode(root.right, target, currSum, list);
        list.remove(list.size() - 1);
    }

}

// list我有点傻傻不会用