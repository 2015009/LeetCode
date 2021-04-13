package LeetCode300;

import javax.swing.tree.TreeNode;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: CHEN SIZHE
 * @Date:2021/4/6 22:42
 */
public class s337 {
    public int rob(TreeNode root) {
        // edge case
        if(root==null) return 0;
        // normal case
        int dp_1=root.val;
        int dp_0 = 0;
        Deque<TreeNode> path = new LinkedList<>();
        if(root.left!=null) path.addLast(root.left);
        if(root.right!=null) path.addLast(root.right);
        int count = path.size();

        while (!path.isEmpty()){
            int cur_val = 0;
            while (count!=0){
                TreeNode temp = path.pollFirst();
                cur_val+=temp.val;
                count--;
                if(temp.right!=null) path.addLast(temp.right);

                if(temp.left!=null)  path.addLast(temp.left);

            }
            count = path.size();
            int tp_1=dp_0+cur_val;
            int tp_0=Math.max(dp_0,dp_1);
            dp_0 = tp_0;
            dp_1 = tp_1;
        }
        return Math.max(dp_0,dp_1);
    }
}
