package Mirror;

import Util.TreeNode;

/**
 * Created by Cynric on 30/09/2016.
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree(new int[]{8, 6, 10, 5, 7, 9, 11});
        TreeNode.pre(root);

        System.out.println("****** MIRROR ******");
        Solution solution = new Solution();
        solution.Mirror(root);
        TreeNode.pre(root);
    }

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        Mirror(root.left);
        Mirror(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }


}
