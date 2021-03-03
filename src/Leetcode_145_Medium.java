/*
* Leetcode 145. Binary Tree Postorder Traversal _Medium
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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


/*
* Time > 53.41%, Memory > 88.93%
* */
public class Leetcode_145_Medium {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<Integer> stack2 = new Stack<Integer>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            if(temp!=null){
                stack2.push(temp.val);
                stack1.push(temp.left);
                stack1.push(temp.right);
            }
        }
        List<Integer> results = new ArrayList<Integer>();
        while(!stack2.isEmpty()){
            results.add(stack2.pop());
        }
        return results;

    }
}
