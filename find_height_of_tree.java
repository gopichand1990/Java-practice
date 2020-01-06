//find_height_of_tree recursively
class Node{
    int data;
    Node left,right;
    public Node(int item){
        item=data;
        left=null;
        right=null;
    }
}
public class Height_of_tree{
     static int Find_height_of_tree(Node root){
         int height=0,height1=0;
         if(root==null){
            return -1;
        }
        if(root.left!=null){
            height= 1+Find_height_of_tree(root.left);
        }
        if(root.right!=null){
            height1=1+Find_height_of_tree(root.right);
        }
        if(height<=height1){
             return height1;
        }
return height;
}
static int Find_height_of_tree(Node root,int data){
         int height=0,height1=0;
         if(root==null){
            return -1;
        }
        if(root.left!=null){
            height= 1+Find_height_of_tree(root.left);
			if(root.left==data){
			   return height;
			}
        }
        if(root.right!=null){
            height1=1+Find_height_of_tree(root.right);
			if(root.right==data){
			  return height1;
			}
        }
    return -1;    
}
public static void main(String[] args){
   Height_of_tree tree=new Height_of_tree();
   Node root=new Node(1);
   root.left=new Node(2);
   root.right=new Node(3);
   root.left.left=new Node(4);
   root.left.right=new Node(5);
   root.right.left=new Node(6);
   root.right.right=new Node(7);
   int h=tree.Find_height_of_tree(root);
   System.out.println("height is"+h);
  }
}