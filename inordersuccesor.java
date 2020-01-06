//Write an algorithm to find the ënextí node (i.e., in-order successor) of a given node in a binary search tree where each node has a link to its parent.
    import java.util.*;
    class Tree_node{
        int data;
        Tree_node parent,left,right;
        public Tree_node(int item){
            data=item;
            parent=null;
            left=null;
            right=null;
        }
    }
    public class findInorderSuccessor {
        static Tree_node search_Node_in_tree(Tree_node root, int data) {
            if (root == null) {
                return null;
            }
            if (data > root.data) {
                return search_Node_in_tree(root.right, data);
            } else if (data < root.data) {
                return search_Node_in_tree(root.left, data);
            } else {
                return root;
            }
        }

        static Tree_node min_element_from(Tree_node C) {
            if (C == null) {
                return null;
            }
            Tree_node temp2 = C.parent;
            while (C != null) {
                if (C.left != null) {
                    return C.left;
                }
                C = C.right;
            }
            return temp2;
        }

        static Tree_node return_inorder_successor_of_node(int data, Tree_node root) {
            if (root == null) {
                return null;
            }
            Tree_node t=null;
            Queue<Tree_node> k=new LinkedList<Tree_node>();
            t=root;
            k.add(root);
            root.parent=null;
            //updating parent for each node
            while(k.size()>0) {
                t = k.remove();
                if (t.left != null) {
                    t.left.parent = t;
                    k.add(t.left);
                }
                if (t.right != null) {
                    t.right.parent = t;
                    k.add(t.right);
                }
            }
            if (root.data == data) {
                if (root.right != null) {
                    return min_element_from(root.right);
                }
            }
        Tree_node B = search_Node_in_tree(root, data);
            System.out.println("search element B data is "+B.data);
			if(B!=null){
			  return B;
			  }
			  return null;
        /*Tree_node temp = B.parent;
           System.out.println("search element B parent data is "+B.parent);*/
           /* if(B.data>root.data)
        {
            if(B.right!=null){
                return B.right;
            }
            if(B.left==null&&B.right==null&&B.parent.left==B){//edge case for leaf node
                return B.parent;
            }
            if(B.left==null&&B.right==null&&B.parent.right==B&&B.data<root.data){//edge case for leaf node
                return root;
            }
            if(B.left==null&&B.right==null&&B.parent.right==B&&B.data>root.data){//edge case for leaf node
                return null;
            }
            return min_element_from(root.right);
        }
            if(B.data<root.data)

        {
            if (B.right != null) {
                return B.right;
            }
            else {
                return temp;
            }
        }*/
    }
        public static void main(String args[]){
            findInorderSuccessor bt=new findInorderSuccessor();
            Tree_node root=new Tree_node(8);
            root.left=new Tree_node(5);
            root.right=new Tree_node(10);
            root.left.left=new Tree_node(4);
            root.left.right=new Tree_node(6);
            root.right.left=new Tree_node(9);
            root.right.right=new Tree_node(11);
            Tree_node S=return_inorder_successor_of_node(8,root);
            System.out.println("inorder successor for 8 is "+S.data);
            Tree_node T=return_inorder_successor_of_node(5,root);
            System.out.println("inorder successor for 5 is "+T.data);
            Tree_node U=return_inorder_successor_of_node(10,root);
            System.out.println("inorder successor for 10 is "+U.data);
            Tree_node V=return_inorder_successor_of_node(4,root);
            System.out.println("inorder successor for 4 is "+V.data);
            Tree_node W=return_inorder_successor_of_node(6,root);
            System.out.println("inorder successor for 6 is "+W.data);
            Tree_node X=return_inorder_successor_of_node(9,root);
            System.out.println("inorder successor for 9 is "+X.data);
            Tree_node Y=return_inorder_successor_of_node(11,root);
            if(Y==null) {
                System.out.println("inorder successor for 11 is " + Y);
            }
            else{
                System.out.println("inorder successor for 11 is " + Y.data);
            }
        }
    }
	
//You are given a binary tree in which each node contains a value. Design an algorithm to print all paths which sum up to that value. Note that it can be any path in the tree - it does not have to start at the root.
