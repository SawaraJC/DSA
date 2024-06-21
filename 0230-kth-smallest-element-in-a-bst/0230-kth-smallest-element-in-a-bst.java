/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        ans = inorder(root);

        return ans.get(k-1);

    }

    public List<Integer> inorder(TreeNode root){
        List<Integer> sol = new ArrayList<>();

        if (root == null)
            return sol;

        sol.addAll(inorder(root.left));
        sol.add(root.val);
        sol.addAll(inorder(root.right));

        return sol;
    }
}