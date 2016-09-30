package Util;

/**
 * Created by Cynric on 30/09/2016.
 */
public class TreeNode {
    public int val = 0;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

    public static TreeNode constructTree(int[] a) {
        TreeNode root = new TreeNode(a[0]);
        constructTree(root, a, 0);
        return root;
    }

    public static void constructTree(TreeNode root, int[] a, int index) {
        if (index * 2 + 1 < a.length) {
            root.left = new TreeNode(a[index * 2 + 1]);
            constructTree(root.left, a, index * 2 + 1);
        }
        if (index * 2 + 2 < a.length) {
            root.right = new TreeNode(a[index * 2 + 2]);
            constructTree(root.right, a, index * 2 + 2);
        }
    }

    public static void pre(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            pre(root.left);
            pre(root.right);
        }
    }
}
