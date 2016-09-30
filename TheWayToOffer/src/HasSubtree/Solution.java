package HasSubtree;


/**
 * Created by Cynric on 30/09/2016.
 */
public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = new TreeNode(array[0]);
        constructTree(root, array, 0);
        pre(root);

        System.out.println("***** root2 *****");
        array = new int[]{5, 10, 11};
        TreeNode root2 = new TreeNode(array[0]);
        constructTree(root2, array, 0);
        pre(root2);

        Solution solution = new Solution();


        System.out.println(solution.HasSubtree(root, root2));
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

    public boolean isSubtree(TreeNode root1, TreeNode root2) {
        if (root1 != null && root1.val == root2.val) {
            if (root2.left == null && root2.right == null) { // sub tree has no children, the procedure ends.
                return true;
            }
            if (root2.left == null) {
                return isSubtree(root1.right, root2.right);
            } else if (root2.right == null) {
                return isSubtree(root1.left, root2.left);
            } else {
                return isSubtree(root1.left, root2.left)
                        && isSubtree(root1.right, root2.right);
            }
        } else {
            return false;
        }
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return preTraverse(root1, root2);
    }

    public boolean preTraverse(TreeNode root, TreeNode root2) {
        if (root != null) {
            if (isSubtree(root, root2)) {
                return true;
            } else {
                if (preTraverse(root.left, root2)) {
                    return true;
                }
                if (preTraverse(root.right, root2)) {
                    return true;
                }
            }
        }
        return false;
    }
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
