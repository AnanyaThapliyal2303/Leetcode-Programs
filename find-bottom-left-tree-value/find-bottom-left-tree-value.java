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
    public int findBottomLeftValue(TreeNode root) {
        Stack<Integer> s=new Stack<Integer>();
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            List<Integer> ans= new ArrayList<Integer>();
            for(int i=0;i<count;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                ans.add(curr.val);
            }
            s.push(ans.get(0));
        }
        return s.pop();
    }
}