class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int hl = Height(root.left);
        int hr = Height(root.right);

        if(Math.abs(hr - hl) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int Height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int hl = Height(root.left);
        int hr = Height(root.right);

        return 1 + Math.max(hl, hr);
    }
}