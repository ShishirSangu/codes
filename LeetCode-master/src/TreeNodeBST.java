class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeNodeBST {
    static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    static TreeNode buildBST(int[] nums, int left, int right) {
        // Base case: If left index is greater than right index, return null
        if (left > right) {
            return null;
        }

        // Find the middle element of the current range
        int mid = left + (right - left) / 2;
        
        // Create a new TreeNode with the middle element as the value
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        node.left = buildBST(nums, left, mid - 1);
        node.right = buildBST(nums, mid + 1, right);

        return node;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,7,8,6,1,4,2,3,};

        // Convert the sorted array to a height-balanced BST
        TreeNode root = sortedArrayToBST(nums);

        // Perform an in-order traversal of the constructed BST
        System.out.println("In-order traversal of the constructed BST:");
        inOrderTraversal(root);
    }

    static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }
}
