// 543. Diameter of Binary Tree
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        fun(root);
        return max(root);
    }
    public int fun(TreeNode root){
        if(root == null) return 0;
        return root.val = Math.max(fun(root.right), fun(root.left)) + 1;
    }
    public int max(TreeNode root){
        if(root == null) return 0;
        if(root.right == null || root.left == null) return root.val - 1;
        return Math.max(Math.max(max(root.left), max(root.right)), root.right.val + root.left.val);
    }
}
