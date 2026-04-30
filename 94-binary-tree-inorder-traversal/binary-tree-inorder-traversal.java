class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(list, root);
        return list;
    }

    public void inorder(List<Integer> x, TreeNode y) {
        if (y == null) return;   

        inorder(x, y.left);
        x.add(y.val);
        inorder(x, y.right);
    }
}