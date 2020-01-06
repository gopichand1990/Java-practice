//level order traversal of tree in java
import java.io.*;
import java.util.*;
class Node{
   int data;
   Node left,right;
   public Node(int item){
     data=item;
     left=null;
     right=null;
   }
}	
class Binary_Tree{
   Node root;
   //parameterised constructor
   Binary_Tree(int key){
      root=new Node(key);
   }
   //default constructor
   Binary_Tree(){
      root=null;
   }
	 Queue<Node> s=new LinkedList<Node>();//empty
 void print_level_order_traversal(Node A){ 
   if(A==null){//1
      return;
   }
   //System.out.println("Before" +s.size());
   if(s.size()>=0){
   s.add(A);//stack 1/1
   }
	while(s.size()>0){
	    Node S=s.remove();
	   System.out.println("Node data is "+S.data); //Printed data:1 2
        if(S.left!=null){
            s.add(S.left);//queue=2
        	}
    	if(S.right!=null){
	        s.add(S.right);//queueu=2 3
	    }
	}
}
}
class Level_order_traversal{
public static void main(String args[]){
   Binary_Tree tree=new Binary_Tree();
   tree.root=new Node(1);
   tree.root.left=new Node(2);
   tree.root.right=new Node(3);
   tree.root.left.left=new Node(4);
   tree.root.left.right=new Node(5);
   tree.root.right.left=new Node(6);
   tree.root.right.right=new Node(7);
   tree.print_level_order_traversal(tree.root);
}
}

/*input:1 2 3 4 5 6 7 
o/p:Node data is 1
Node data is 2
Node data is 3
Node data is 4
Node data is 5
Node data is 6
Node data is 7*/