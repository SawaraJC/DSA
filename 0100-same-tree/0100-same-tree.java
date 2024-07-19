class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
           if(p== null && q==null){
               return true;
           } 

           if((p== null && q!= null) || (p!=null && q==null)){
               return false;
           }

           boolean right = isSameTree(p.right, q.right);
           boolean left = isSameTree(p.left, q.left);

           boolean valCheck = (p.val == q.val);

           if(valCheck && right && left)
                return true;
            return false;

    }
}