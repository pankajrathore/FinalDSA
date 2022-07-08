package tree;

import java.util.ArrayList;
import java.util.List;

public class Leaf {
   // static List<Integer> retlist=new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(15);
        root.right.left=new TreeNode(12);
        root.right.right=new TreeNode(20);
        root.right.right.left=new TreeNode(16);
        List<Integer> list =new ArrayList<>();
       list=getLeaves(root,list);
       removeLeaves(root);

        list =new ArrayList<>();
        list=getLeaves(root,list);
        printList(list);
        //getLeaves(root, list);

       // printList(retlist);
    }

    private static void removeLeaves(TreeNode node) {
        if(node!=null && node.left!=null) removeLeaves(node.left);
        if(node.left==null && node.right==null)
            node=null;
        if(node!=null && node.right!=null) removeLeaves(node.right);
    }


    private static List<Integer> getLeaves(TreeNode node, List<Integer> list) {
        if(node.left!=null) getLeaves(node.left, list);
        if(node.left==null && node.right==null)
            list.add(node.val);
        if(node.right!=null) getLeaves(node.right, list);
        return list;

    }
    private static void printList(List<Integer> list) {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i).intValue()+" ");
        }
    }

}
