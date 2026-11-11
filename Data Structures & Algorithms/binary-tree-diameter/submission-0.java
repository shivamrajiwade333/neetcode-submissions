
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftdia = diameterOfBinaryTree(root.left);
        int rightdia = diameterOfBinaryTree(root.right);

        int hl = maxDepth(root.left);
        int hr = maxDepth(root.right);

        int s = hr + hl;

        int preans = Math.max(leftdia, rightdia);

        int ans = Math.max(preans, s);

        return ans;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}
