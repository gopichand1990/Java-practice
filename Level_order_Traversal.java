//level order traversal of tree in java
class Node{
   int data;
   Node left,right;
   public Node(int item){
     data=item;
     left=NULL:
     right=NULL;
   }
}	
class Binary_Tree{
   Node root;
   //parameterised constructor
   public Binary_Tree(int key){
      root=new Node(key);
   }
   //default constructor
   public Binary_tree(){
      root=NULL:
   }
	  queue<String> s=new LinkedList<String>();
 void print_level_order_traversal(Node A){ 
   if(A==NULL){
      return;
   }
   if(s.Empty()){
   s.add(A);//stack 1
   }
   Node B=s.remove(); //B=2 queue=2,3
   System.out.println(B.data); //Printed data:1 2
   if(B.left!=NULL){
     s.add(B.left);//queue=4
	}
	if(B.right!=NULL){
	  s.remove(B.right);//queueu=3,4,5
	}
	while(!s.Empty()){
	   print_level_order_traversal(s.peek());
	}
}
public static void main(String args[]){
   Binary_tree tree=new Binary_tree();
   tree.root=new Node(1);
   tree.root.left=new Node(2);
   tree.root.right=new Node(3);
   tree.root.left.left=new Node(4);
   tree.root.left.right=new Node(5);
   tree.root.right.left=new Node(6);
   tree.root.right.right=new Node(7);
   tree.print_level_order_traversal(root);
}

////Implement a function to check if a tree is balanced. For the purposes of this question,a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from the root by more than one
Hashmap<Node,Integer> hm=new Hashmap<Node,Integer>;
Stack<Node> s1=new Stack<Node>;
bool check_binary_tree_is_balanced(Node root){
  if(root==null){
     return;
  }
  Node Temp=root;
  while(Temp!=null){
      
    
  
  
    
//Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.
//Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
//Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is notnecessarily a binary search tree.
//You are given a binary tree in which each node contains a value. Design an algorithm to print all paths which sum up to that value. Note that it can be any path in the tree- it does not have to start at the root.   

	  
	
	  
  
   
   
	  
	   
 