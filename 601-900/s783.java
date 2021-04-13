package LeetCode300;

public class s783 {
    int ans;
    int pre;
    public int minDiffInBST(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        inOrder(root);
        return  ans;
    }
    public void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        if(pre==-1){
            pre = root.val;
        }else{
            ans = Math.min(ans,root.val-pre);
            pre = root.val;
        }
        inOrder(root.right);
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
