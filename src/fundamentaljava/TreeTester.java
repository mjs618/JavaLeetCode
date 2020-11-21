package fundamentaljava;

import javax.naming.ldap.ExtendedRequest;

public class TreeTester {

   static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val= x;
        }
    }

    public static void main(String[] args) {

        int res = treeTest();
        System.out.println(res);

    }

  private static int  treeTest (){
      TreeNode t0 = new TreeNode(3);
      TreeNode t1 = new TreeNode(5);
      TreeNode t2 = new TreeNode(4);
      TreeNode t3 = new TreeNode(2);
      TreeNode t4 = new TreeNode(1);

      t0.left = t2;
      t0.right = t1;
      t1.left = t4;
      t1.right = t3;
      int res = t0.left.left.val;
      //if (res == null )
      System.out.println(res);
      return res;
  }


}
