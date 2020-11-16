package ExtraCredit;

import Problem1.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KDistance {
    public static List<Integer> distanceK(TreeNode<Integer> root, TreeNode<Integer> target, int k) {
        // homework
        List<Integer> result = new ArrayList<>();
        return result;  // place holder
        //Comment as to how to find all the value of nodes which are k distance away.
        /*
         First we would have to find the target, assuming there are no dupes. We would have a search function to find this
         TreeNode. Once we found it we do a "radius" check, which would check the amount of paths we can take in k distance. So we would have
         to check to go up and down and to the same level/laterally. Once we found those paths we input the treenode value into the result list
         and return the result which has all the values.
         */
    }
}
