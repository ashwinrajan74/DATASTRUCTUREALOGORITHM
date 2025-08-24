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
class symmentry {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
       return  ismirror(root.left,root.right);
       }
       public  static  boolean ismirror(TreeNode l,TreeNode r){
        if(r==null&&l==null) return true;
        if(r==null || l==null)return false;

            if(r.val!=l.val){
                return false;
            }
            boolean left1=ismirror(l.left,r.right);
            boolean right1=ismirror(l.right,r.left);
            if(left1==true&&right1==true){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
