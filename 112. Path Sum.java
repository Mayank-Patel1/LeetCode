// 112. Path Sum
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root, targetSum, 0);
    }
    public boolean fun(TreeNode root, int target, int sum) {
        if(root==null){return false;}
        sum += root.val;
        if(root.right==null && root.left == null && target == sum){
            return true;
        }
        return (fun(root.right, target, sum) || fun(root.left, target, sum));
    }
}
