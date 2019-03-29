//level order traversal of tree in java
import java.io.*;
import java.util.*;
//inorder preorder rootnd postorder trrootversrootl
class Node{
   int data;
   Node left,right;
   public Node(int item){
     data=item;
	 left=null;
	 right=null;
    }
}
 class Traversals{
    Node root;
	public Traversals(int key){
	  root=new Node(key);
	}
	public Traversals(){
	   root=null;
	}
	//inorder iterative
	void inorder_traversal_iterative(Node root){
	    System.out.println("inside inorder iterative");
	  if(root==null){//1
	     return;
	  }
	  Stack<Node> s=new Stack<Node>();
	  Node B=root;
	  while(s.size()>=0||B!=null){
			while(B!=null){
				s.push(B);//1
				B=B.left;////1 2 4
			}
	     if(s.size()>0){
	        B=s.pop();//
	        System.out.println(B.data);//4
	        B=B.right;
		 }
	   }
	   }
	//inorder recursive
	void inorder_recursive(Node root){
	    //System.out.println("inside inorder recursive");
	   if(root==null){
	     return;
	   }
	   if(root.left!=null){
	   inorder_recursive(root.left);
	   }
	   System.out.println(root.data);
	   if(root.right!=null){
	   inorder_recursive(root.right);
	   }
	}
		 
			
		 
	//postorder recursive
	void postorder_recursive(Node root){
	    //System.out.println("inside postorder recursive");
	  if(root==null){
	     return;
	  }
	  if(root.left!=null){
	  postorder_recursive(root.left);
	  }
	  if(root.right!=null){
	  postorder_recursive(root.right);
	  }
	  System.out.println(root.data);
	}
	
	
    //preorder iterative	
	void preorder_traversal_iterative(Node root){
	    System.out.println("inside preorder iterative");
	if(root==null){
	   return;
	}
	Stack<Node> s2=new Stack<Node>();
	Node Temp=root;//1
	   s2.push(Temp);//1
	while(!s2.isEmpty()){
	   Node Temp1=s2.pop();//1 2 4 5 3 6 4
	   System.out.println(Temp1.data);
	   if(Temp1.right!=null){
	   s2.push(Temp1.right);//
	   }
	   if(Temp1.left!=null){
	   s2.push(Temp1.left);//3 
	   }
	}
	}
	//preorder recursion
	void preorder_recursive(Node root){
	   if(root==null){
	     return;
		 }
	   System.out.println(root.data);
	   if(root.left!=null){
	   preorder_recursive(root.left);
	   }
	   if(root.right!=null){
	   preorder_recursive(root.right);
	   }
	}
}
public class DFS{
public static void main(String args[]){
		Traversals tree=new Traversals(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
		System.out.println("inorder tree travesal iterative\n");
		tree.inorder_traversal_iterative(tree.root);*/
		
		System.out.println("inorder tree traversal recursive\n");
		tree.inorder_recursive(tree.root);
		
		System.out.println("postorder tree traversal recursive\n");
		tree.postorder_recursive(tree.root);
		
		System.out.println("preorder tree travesal iterative\n");
		tree.preorder_traversal_iterative(tree.root);
		
		System.out.println("preorder tree traversal recursive\n");
		tree.preorder_recursive(tree.root);
	}
}
		
		
  
	
	   
	   
	
	
	   
	
	
		  
	
	  
	
	
	
	
	
     
	  