package pocketGems;

import java.util.Stack;

public class TernaryExpressionToBT {
    public static void main(String[] args) {
        TernaryExpressionToBT ternaryExpressionToBT = new TernaryExpressionToBT();
        String exp = "a?b?c:d:e";
        ternaryExpressionToBT.convert(exp.toCharArray());
    }

    private TreeNode convert(char[] exp) {
        TreeNode root = new TreeNode(exp[0]);
        TreeNode n = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        for (int i =1;i<exp.length;i+=2) {
            if(exp[i] == '?'){
                root.left = new TreeNode(exp[i+1]);
                stack.add(root);
                root = root.left;
            }
            if(exp[i] == ':'){
                root = stack.pop();
                while(root.right!=null){
                    root = stack.pop();
                }
                root.right = new TreeNode(exp[i+1]);
                stack.add(root);
                root = root.right;
            }
        }

        return n;
    }
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        char value;

        public TreeNode(char x){
            this.value = x;

        }
    }
}
