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
import java.util.Stack;

class BSTIterator {
    // Stack to store the path to the next smallest element
    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        // Push all the left children of the root node
        pushAllLeft(root);
    }

    public int next() {
        // The top node on the stack is the next smallest element
        TreeNode node = stack.pop();
        
        // If the node has a right child, process its left branch
        if (node.right != null) {
            pushAllLeft(node.right);
        }
        
        return node.val;
    }

    public boolean hasNext() {
        // If the stack is not empty, there are still elements to visit
        return !stack.isEmpty();
    }

    // Helper method to push all leftmost nodes onto the stack
    private void pushAllLeft(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */