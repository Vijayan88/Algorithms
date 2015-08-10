package pocketGems;

public class INOrderTraversal {
    public static void main(String[] args) {
        INOrderTraversal inOrderTraversal = new INOrderTraversal();
        TreeNode nodes = inOrderTraversal.createTree();
        inOrderTraversal.nextElement(nodes.left.right);
    }

    private TreeNode createTree() {
        TreeNode rootNode = new TreeNode(8);
        TreeNode left1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(6);
        TreeNode right1 = new TreeNode(10);
        TreeNode right3 = new TreeNode(14);
        left2.parent = left1;
        right2.parent = left1;
        right3.parent = right1;
        left1.left = left2;
        left1.right = right2;
        left1.parent = rootNode;
        rootNode.left = left1;
        right1.right = right3;
        right1.parent = rootNode;

        rootNode.right = right1;

        return rootNode;
    }

    private TreeNode nextElement(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.right!= null){
           return getLeftMostNode(root.right);
        } else {
            TreeNode n = root;
            TreeNode q = root.parent;
            while (q != null && q.left != n) {
                n = q;
                q = q.parent;
            }
            return q;
        }

    }

    private TreeNode getLeftMostNode(TreeNode root) {
        while(root.left!=null){
            root = root.left;
        }
        return root;
    };

    public class TreeNode{
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        int value;

        public TreeNode(int x){
            this.value = x;

        }
    }
}
