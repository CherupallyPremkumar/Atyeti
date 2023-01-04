package DataStructure;

public class TreeNode {
    TreeNode root;
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int data)
    {
        value=data;
    }
    public void createBinaryTree()
    {
        TreeNode treeNode=new TreeNode(7);
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(76);
        TreeNode treeNode5=new TreeNode(37);

        root =treeNode;
        treeNode.left =treeNode1;
        treeNode.right=treeNode2;
    }
}
class Imple
{


    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(7);
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(76);
        TreeNode treeNode5=new TreeNode(37);



    }
}
 class Test
{
    public static void main(String[] args)
    {
        System.out.println((100/25.0)*Integer.parseInt("5") + 50);
    }
}