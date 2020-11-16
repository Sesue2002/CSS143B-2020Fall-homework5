package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework final
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        TreeNode<Integer> current = root;

        if(root == null){
            return result;
        }

        s.push(current);

        if(current.left == null && current.right == null){
            result.add(current.val);
            return result;
        }
        if(!(current.left == null)){
            current = current.left;
        }
        if(current.left == null && current.right != null){
            current = current.left;
        }

        while(current != null || !s.empty()){
            while(current != null){
                s.push(current);
                current = current.left;
            }
            current = s.pop();
            result.add(current.val);
            current = current.right;
        }

        //will go directly to here if null straight away and return a stack of size 0

        return result;  // place holder
    }
}
