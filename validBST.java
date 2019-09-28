 
    public boolean validBST(TreeNode root) {
        return helper (root,null,null);
        
    }
    
    public boolean helper(TreeNode root, TreeNode min, TreeNode max){
        if (root == null){
            return true;
        }
        
        if (min != null && root.val <= min.val || max !=null && root.val >= max.val){
            return false;
        }
        
        return helper(root.left, min, root) && helper(root.right, root, max);
    }
} 
