package niuke_top200.春招.二叉树;

import java.util.Arrays;



// 确定索引位置很重要，一个是在条件语句中判断，一个是先确立标记位再说
public class RebuildTreeNode {

    public static void main(String[] args) {

    }

    public static DeepTraversal.TreeNode rebuildTreeNode(int[] pre, int[] in){
        if(pre.length == 0 || in.length == 0) return null;
        int tag = pre[0];
        int pos = 0;
        for (int i = 0; i < in.length; i++) {
            if(in[i] == tag){
                pos = i;
            }
        }
        DeepTraversal.TreeNode node = new DeepTraversal.TreeNode(tag);
        node.left = rebuildTreeNode(Arrays.copyOfRange(pre, 1, pos + 1), Arrays.copyOfRange(in, 0, pos));
        node.right = rebuildTreeNode(Arrays.copyOfRange(pre, pos + 1, pre.length - 1),
                Arrays.copyOfRange(in, pos + 1, in.length - 1));
        return node;
    }

}
