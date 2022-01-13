package niuke_top200.剑指offer.lee64_68;

public class CommonAstra {

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

    public TreeNode commonAstra(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root.val == p.val || root.val == q.val) return root;
        TreeNode left = commonAstra(root.left, p, q);
        TreeNode right = commonAstra(root.right, p, q);
        if(left == null) return right;
        else if(right == null) return left;
        else return left;
    }
}
