package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLeftView {
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);

        root.right=new TreeNode(3);
        root.right.right=new TreeNode(4);

        List<Integer> leftView=leftSideView(root);
        printList(leftView);

    }

    private static void printList(List<Integer> list) {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i).intValue()+" ");
        }
    }

    public static List<Integer> leftSideView(TreeNode root) {
        List<Integer> retList=new ArrayList<>();
        if(root==null)
            return retList;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=(TreeNode) queue.poll();
                if(i==0)
                {
                    retList.add(node.val);
                }
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }

        }
        return retList;
    }
}


