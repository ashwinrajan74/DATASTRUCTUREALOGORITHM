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
class pathsum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> r=new ArrayList<>();
        path(root,0,r);
        for(int i=0;i<r.size();i++){
            if(targetSum==r.get(i)){
                return true;
            }
        }
        return false;
    }
    public static void path(TreeNode root,int csum, ArrayList<Integer> r){
        if(root==null){
            return ;
        }
        csum+=root.val;
        if(root.right==null&&root.left==null){
            r.add(csum);
            return;
        }
        path(root.right,csum,r);
        path(root.left,csum,r);
        
    
    }
}
