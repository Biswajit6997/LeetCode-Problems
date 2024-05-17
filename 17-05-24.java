class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        // If the root is null, return null
        if (root == null) {
            return null;
        }

        // Recursively call the function on left and right subtrees
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        // If the current node is a leaf and its value equals the target, remove it
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }

        return root;
    }
}
