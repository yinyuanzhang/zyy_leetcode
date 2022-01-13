package niuke_top200.剑指offer.lee34_39;

import java.util.HashMap;

public class SearchTreeToTreenode {

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

    public class ListNode{
        int val;
        ListNode pre;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    HashMap<Integer, ListNode> map = new HashMap<>();
    int k = 1;
    public ListNode searchTreeToTreenode(TreeNode root){
        transTreeNode(root);
        ListNode result = toListNode();
        return result;
    }


    private void transTreeNode(TreeNode root) {
        if(root == null) return;
        transTreeNode(root.left);
        map.put(k++, new ListNode(root.val));
        transTreeNode(root.right);
    }

    private ListNode toListNode() {
        for(int i = 1; i < k; i++){
            if(map.containsKey(i + 1)){
                map.get(i).next = map.get(i + 1);
            }
            if(map.containsKey(i - 1)){
                map.get(i).pre = map.get(i - 1);
            }
        }
        map.get(1).pre = map.get(k - 1);
        map.get(k - 1).next = map.get(1);
        ListNode head = new ListNode(1);
        head.next = map.get(1);
        return head;
    }
}


// 中序遍历即为正向排序
// if(root == null) return; 初始条件忘记判空
// 采用的和复制链表一样的策略: 先中序遍历存储hashMap，再二次遍历处理left和right节点。