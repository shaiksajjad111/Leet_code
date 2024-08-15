class Solution {
    public boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == target) return true;
        if (hasPathSum(root.left, target - root.val) || hasPathSum(root.right, target - root.val)) return true;
        else return false;
    }
}