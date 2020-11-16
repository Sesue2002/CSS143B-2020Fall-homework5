package Problem2;

import Problem1.TreeNode;

public class LCA {

    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        // homework
        // hint: pay attention to the assumptions of this problem.
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left, p, q);

        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if(l != null && r != null){
            return root;
        }

        return l != null? l : r;    // place holder
    }
}
