package niuke_top200.剑指offer.lee64_68;

public class CommonAsterInSearchTree {

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

    public TreeNode commonAsterInSearchTree(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root.val == p.val || root.val == q.val) return root;
        if(root.val > p.val && root.val > q.val) return commonAsterInSearchTree(root.left, p, q);
        else if(root.val < p.val && root.val < q.val) return commonAsterInSearchTree(root.right, p, q);
        else return root;
    }

}
