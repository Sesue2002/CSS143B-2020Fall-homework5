package Problem1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> intVals = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return result;
        }

        q.add(root);

        TreeNode<Integer> current;

        while(!q.isEmpty() && root != null){
            int s = q.size();
            for(int i = 0; i < s; i++) {
                current = q.poll();

                intVals.add(current.val);

                if (current.left != null) {
                    q.add(current.left);
                }

                if (current.right != null) {
                    q.add(current.right);
                }
            }
            result.add(new ArrayList<>(intVals));
            intVals.clear();
        }

        return result;
    }
}
