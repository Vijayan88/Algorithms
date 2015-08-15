package pocketGems;


import java.util.Stack;

public class TernaryExpRightToleft {
    public static void main(String[] args) {
        TernaryExpRightToleft ternaryExpRightToleft = new TernaryExpRightToleft();
        ternaryExpRightToleft.constructTree("a?b?c:d:e");
    }

    private void constructTree(String s) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = new TreeNode(s.charAt(s.length()-1));
        stack.add(node);
        for(int i=s.length()-2;i>=0;i-=2){
            if(s.charAt(i) == ':'){
                stack.push(new TreeNode(s.charAt(i - 1)));
            }
            if(s.charAt(i) == '?'){
                TreeNode cNode = new TreeNode(s.charAt(i-1));
                cNode.left = stack.pop();
                cNode.right = stack.pop();
                stack.push(cNode);
            }
        }
        System.out.println(stack.peek());
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
