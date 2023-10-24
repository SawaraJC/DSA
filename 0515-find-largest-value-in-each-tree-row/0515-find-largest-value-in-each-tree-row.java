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
    public List<Integer> largestValues(TreeNode root) {
       
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        if(root == null) return ans;
        que.offer(root);
        que.offer(null);
        int max = Integer.MIN_VALUE;

        while(!que.isEmpty()){
            TreeNode temp = que.poll();
            if(temp != null){
                if (max < temp.val) max = temp.val;
                if (temp.left != null) que.offer(temp.left);
                if (temp.right != null) que.offer(temp.right);
            }else {
                ans.add(max);
                max = Integer.MIN_VALUE;
                if(!que.isEmpty()) que.offer(null);
            }

        }
        return ans;
    }
}