
import java.util.ArrayList;
import java.util.List;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//}

public class Try {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", paths);
        }
        return paths;
    }

    private void dfs(TreeNode node, String pathSoFar, List<String> paths) {
        // Add the current node value to the current path
        pathSoFar += node.val;

        // Check if the current node is a leaf node (has no children)
        if (node.left == null && node.right == null) {
            // If it is a leaf node, add the path to the list of paths
            paths.add(pathSoFar);
            return;
        }

        // If not a leaf node, continue traversing left and right subtrees
        if (node.left != null) {
            dfs(node.left, pathSoFar + "->", paths);
        }

        if (node.right != null) {
            dfs(node.right, pathSoFar + "->", paths);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        Try solution = new Try();
        List<String> paths = solution.binaryTreePaths(root);

        System.out.println(paths); // Output: ["1->2->5", "1->3"]
    }
}

