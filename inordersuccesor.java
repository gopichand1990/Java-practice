//Write an algorithm to find the ënextí node (i.e., in-order successor) of a given node in a binary search tree where each node has a link to its parent.
    import java.util.*;
    class Node3{
        int data;
        Node3 parent,left,right;
        public Node3(int item){
            data=item;
            parent=null;
            left=null;
            right=null;
        }
    }
    public class findInorderSuccessor {
        static Node3 search_Node_in_tree(Node3 root, int data) {
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

        static Node3 min_element_from(Node3 C) {
            if (C == null) {
                return null;
            }
            Node3 temp2 = C.parent;
            while (C != null) {
                if (C.left != null) {
                    return C.left;
                }
                C = C.right;
            }
            return temp2;
        }

        static Node3 return_inorder_successor_of_node(int data, Node3 root) {
            if (root == null) {
                return null;
            }
            Node3 t=null;
            Queue<Node3> k=new LinkedList<Node3>();
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
        Node3 B = search_Node_in_tree(root, data);
            System.out.println("search element B data is "+B.data);
        Node3 temp = B.parent;
           System.out.println("search element B parent data is "+B.parent);
            if(B.data>root.data)
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
        }
            return null;
    }
        public static void main(String args[]){
            findInorderSuccessor bt=new findInorderSuccessor();
            Node3 root=new Node3(8);
            root.left=new Node3(5);
            root.right=new Node3(10);
            root.left.left=new Node3(4);
            root.left.right=new Node3(6);
            root.right.left=new Node3(9);
            root.right.right=new Node3(11);
            Node3 S=return_inorder_successor_of_node(8,root);
            System.out.println("inorder successor for 8 is "+S.data);
            Node3 T=return_inorder_successor_of_node(5,root);
            System.out.println("inorder successor for 5 is "+T.data);
            Node3 U=return_inorder_successor_of_node(10,root);
            System.out.println("inorder successor for 10 is "+U.data);
            Node3 V=return_inorder_successor_of_node(4,root);
            System.out.println("inorder successor for 4 is "+V.data);
            Node3 W=return_inorder_successor_of_node(6,root);
            System.out.println("inorder successor for 6 is "+W.data);
            Node3 X=return_inorder_successor_of_node(9,root);
            System.out.println("inorder successor for 9 is "+X.data);
            Node3 Y=return_inorder_successor_of_node(11,root);
            if(Y==null) {
                System.out.println("inorder successor for 11 is " + Y);
            }
            else{
                System.out.println("inorder successor for 11 is " + Y.data);
            }
        }
    }
