/*4.1 Implement a function to check if a tree is balanced. For the purposes of this question, a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from the root by more than one.
_
________________________________________________________________pg 123
4.2 Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
_
________________________________________________________________pg 124
4.3 Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.
_
________________________________________________________________pg 125
4.4 Given a binary search tree, design an algorithm which creates a linked list of all the nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
_
________________________________________________________________pg 126
4.5 Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node in a binary search tree where each node has a link to its parent.
_
________________________________________________________________pg 127
4.6 Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.
_
________________________________________________________________pg 128
4.7 You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
_
________________________________________________________________pg 130
4.8 You are given a binary tree in which each node contains a value. Design an algorithm to print all paths which sum up to that value. Note that it can be any path in the tree - it does not have to start at the root.
_
________________________________________________________________pg 131
*/
//check if a tree is balanced or not
class Node{
  int data;
  Node left,right;
  public Node(int item){
    data=item;
	left=null;
	right=null;
	}
}
class Btree{
   int find_height_of_node_in_binary_tree(int data,Node root,int level){
     Node B=root;
	 if(B==null){
	   return;
	   }
	 if(B.data==data){
	   return level;
	 }
	 if(B.right!=null&&data>root.data){
	   return find_height_of_node_in_binary_tree(int data,root.right,level+1);
	 }
	 if(B.right!=null&&data<root.data){
	   return find_height_of_node_in_binary_tree(int data,root.right,level+1);
	   }
	}
  int find_diference_between_min_and_max_height_of_nodes_in_Binary_tree(Node root){
     if(root==null){
	   return;
	   }
	  Queue<Node> q=new Queue<Node>();
	  q.enqueue(root);
	  //to get all leaf nodes into queue data structure
	  while(q.size()>0){
	     Node C=q.peek();
		 if(C.left!=null||C.right!=null){
		     q.pop();
			 if(C.left!=null){
			    q.enqueue(C.left);
				}
			 if(C.right!=null){
			    q.enqueue(C.right);
				}
		 }
       }
	   //to find min and max height of nodes
	   int count=0;
	   while(q.size()>0){
	      int min_height=0;
		  int max_height=0;
		  if(count==0){
		     Node D=q.pop();
			 int height= find_height_of_node_in_binary_tree(D.data,root,1);
			 min_height=height;
			 max_height=height;
		  }
		  else{
		    if(height<min_height){
			   min_height=height;  
			 }
			if(height>max_height){
               	max_height=height;
			}
		  }
		}
		retutn max_height-min_height;
    }
}
class B{
  public static void main(String args[]){
     Btree b=new Btree();
	 b.root=new Node(1);
	 b.root.left=new Node(2);
	 b.root.right=New Node(3);
	 b.root.left.left=new Node(4);
	 b.root.left.right=new Node(5);
	 b.root.right.left=new Node(6);
	 b.root.right.right=new Node(7);
	 int c=b.find_diference_between_min_and_max_height_of_nodes_in_Binary_tree(b.root);
	 if(c>1){
	   System.out.println("Tree is unbalanced");
	 }
	 else{
	   System.out.println("Tree is balanced");
	 }
	}
}

//Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.
class Node{
  int data;
  Node left,right;
  public Node(int item){
   data=item;
   left=null;
   right=null;
   }
}
class Btree{
   Node create_tree_from_sorted_array(int[] a){
     int len=a.length();
	 int mid=len/2;
	 Node root=new Node(a[mid]);
	 Node c=root;
	 Node b=root;
	 int i=mid-1;
	 while(i>=0){
	    c.left=new Node(a[i]);
		i--;
		c=c.left;
	 }
	 int j=mid+1;
	 while(j<len){
	   b.right=new Node(a[j]);
	    j++;
		b=b.right;
	 }
	 return root;
   }
}

Class B{
  public static void main(String args[]){
   int a[10]={1,2,3,4,5,6,7,8,9,10};
   Btree c=new Btree();
   Node A= c.create_tree_from_sorted_array(a);
   }
}

//In a Binary Tree, Create Linked Lists of all the nodes at each depth.
class Node{
  int data;
  Node left,right;
  public Node(int item){
    data=item;
	left=null;
	right=null;
	}
}
class Linkedlist{
   int data;
   Node next;
   public Linkedlist(int item){
     data=item;
	 next=null;
	 }
  }     
class Btree{
  void Print_linkedlists_at_each_level_in_binary_tree(Node root){
     if(root==null){
	   return;
	 }
   Queue<Node> q=new LinkedLIst<Node>();
   q.insert(root);
   Arraylist<Linkedlist> al=new Arraylist<Linkedlist>();
   while(!q.isEmpty()){
      int m=q.size();
	  while(m>0){
	    Node B=q.dequeue();
		Linkedlist head=null;
		Linkedlist temp=null;
		if(head==null){
		   head=B;
		   temp=B;
		   }
		else{
		    temp.next=B;
			temp=temp.next;
			}
		if(B.left!=null){
		   q.enqueue(B.left);
		 }
		 if(B.right!=null){
		   q.enqueue(B.right);
		 }
		 al.add(head)
		 }
		 display(al);
	}
	void display(Arraylist<linkedlist> al){
	  iterator it=al.iterator();
	  Linkedlist head=(Linkedlist)it.hasNext();
	  while(head!=null){
	    System.out.println(head.data);
		head=head.next;
		}
	}	
}
}
class B{
   public static void main(String args[]){
      Btree bt=new Btree();
	  bt.root=new Node(3);
	  bt.root.left=new Node(7);
	  bt.root.right=new Node(5);
	  bt.root.left.left=new Node(8);
	  bt.root.left.right=new Node(0);
      bt.root.right.left=new Node(9);
	  bt.root.right.right=new Node(1);
	  bt.Print_linkedlists_at_each_level_in_binary_tree(bt.root);
	  }
}

//Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node in a binary search tree where each node has a link to its parent.
class Node{
int data;
 Node parent,left,right;
 public Node(int item){
     data=item;
	 Parent=null;
	 left=null;
	 right=null;
	 }
}
class BST{
 Node search_Node_in_tree(Node root,int data){
  if(root==null){
     return;
  }
  if(data>root.data){
     return search_Node_in_tree(root.right,data);
  }
  else if(data<root.data){
     return search_Node_in_tree(root.left,data);
  }
  else{
     return root;
  }
  }
Node min_element_from(Node C){
  if(C==null){
    return;
	}
	Node temp2=C.parent;
	while(C!=null){
	  if(C.left!=null){
	     return C.left;
	  }
	  C=C.right;
	 }
	 return temp2;
}   
    
Node return_inorder_successor_of_node(int data,Node root){
 if(root==null){
    return;
 }
 if(root.data==data){
   return null;
   }
 Node B=search_Node_in_tree(data,root);
   if(B!=null){
      Node temp=B.parent;
   }
      if(B.data>root.data){
	     return min_element_from(root.right);
	  }
	  if(B.data<root.data){
	      if(B.right!=null){
		    return B.right;
			}
		  else{
		     return temp;
			 }
      }
    }
}
class B{
   public static void main(String args[]){
      Btree bt=new Btree();
	  bt.root=new Node(3);
	  bt.root.left=new Node(7);
	  bt.root.right=new Node(5);
	  bt.root.left.left=new Node(8);
	  bt.root.left.right=new Node(0);
      bt.root.right.left=new Node(9);
	  bt.root.right.right=new Node(1);
	Node S=bt.return_inorder_successor_of_node(5,bt.root)
	  System.out.println(S.data);
	  }
}

//Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree
class Node{
   int data;
   Node left,right;
   public Node(int item){
      data=item;
	  left=null;
	  right=null;
	  }
}
class BTree{
public Queue<Node> find_path_of_node_from_root(Node root,Node A){
   if(root==null||A==null){
     return;
    }	 
	Node temp=root;//2
	Node B,parent;
	parent=null;//null
	Queue<Node> q=new Queue<Node>();
	HashMap<Node,Node> hm=new HashMap<Node,Node>();
	q.insert(root);//1
	hm.put(root,parent);
	while(q.size()>0){
	  Node B=q.dequeue();//1
	  parent=B;//1
	  if(B.left!=null){
	     q.enqueue(B.left);
		 hm.put(B.left,B);
		 }
	  if(B.right!=null){
	     q.enqueue(B.right);
		 hm.put(B.right,B);
		 }
	}
	Stack<Node> q1=new Stack<Node>();
	Node X=hm.get(A);
	while(X!=root){
	   q1.push(X);//4 2
	   X=hm.get(X);
	   }
	   q1.push(X);//11 4 4 2 2 1 1 null   
	   return q1;           //5 3  3 1  1 null  
 }   
Node find_common_ancestor_for_two_nodes(Stack s1,Stack s2){
  iterator it=s1.iterator();
  while(it.hasNext()){
     Node temp=it.next();
     if(s2.contains(temp){
	     return temp;
		 }
	}
	return null;
}
}
class B{
   public static void main(String args[]){
      BTree bt=new BTree();
	  bt.root=new Node(3);
	  bt.root.left=new Node(7);
	  bt.root.right=new Node(5);
	  bt.root.left.left=new Node(8);
	  bt.root.left.right=new Node(0);
      bt.root.right.left=new Node(9);
	  bt.root.right.right=new Node(1);
	  Queue<Node> q2=new Queue<Node>();
	  Queue<Node> q3=new Queue<Node>();
	q2=find_path_of_node_from_root(bt.root,7)
	q3=find_path_of_node_from_root(bt.root,9)
	 Node N=find_common_ancestor_for_two_nodes(q2,q3);
	 if(N){
	    System.out.println(N.data);
	  }
	 else{
	    System.out.println("No ancestor");
	 }
}
}

//4.8 You are given a binary tree in which each node contains a value. Design an algorithm to print all paths which sum up to that value. Note that it can be any path in the tree - it does not have to start at the root.
class Node{
  int data;
  Node left,right,parent;
  public Node(int item){
     dat=item;
	 left=null;
	 right=null;
	 parent=null;
	 }
}
 
void set_parent_for_each_node(Node root){
  Node B=root;
   if(B==null){
   
	    
	    


	
	   
	   
	     
	  
	  
	
	  




			
   
   




	    
	
	
	
	
	
	
    	
	
	   
	 

	 
			 
		  
	   
	 



