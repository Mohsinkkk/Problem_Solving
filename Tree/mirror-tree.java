class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node == null) return;
        
        mirror(node.left);
        mirror(node.right);
        
        Node left = node.left;
        Node right = node.right;
        
        node.left = right;
        node.right = left;
        
        return;
    }
}
