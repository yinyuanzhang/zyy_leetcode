package niuke_top200.春招.二叉树;


// 二叉树的最近公共祖先   前两个特殊情况可合并【其实不合并更好理解哈】
// 二叉搜索树临界条件其实是一致的
public class FirstCommonAncestor {

    public static void main(String[] args) {

    }

    // 这种写法 firstCommonAncestor函数的功能意义不够明确  只能理解为可能的最近公共祖先(只有p或q，那就是p或q；都有的话就是最近的)
    public DeepTraversal.TreeNode firstCommonAncestor(DeepTraversal.TreeNode root, int o1, int o2){
        if(root == null) return null;
        if(root.val == o1 || root.val == o2) return root;
        DeepTraversal.TreeNode node1 = firstCommonAncestor(root.left, o1, o2);
        DeepTraversal.TreeNode node2 = firstCommonAncestor(root.right, o1, o2);
        if(node1 == null) return node1;
        if(node2 == null) return node2;
        else return root;
    }


}
