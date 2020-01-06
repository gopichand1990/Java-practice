//check if a tree is balanced or not
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
public class Balanced {
     int find_height_of_node_in_binary_tree(int data,Node root,int level) {
        Node B = root;
        int h = 1;
        if (B == null) {
            return -1;
        } else {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(B);
            while (queue.size() > 0) {
                int size = queue.size();
                int flag = 0;
                while (size > 0) {
                    Node C = queue.peek();
                    if(C.data==data){
                        return h;
                    }
                    if (C.left != null || C.right != null) {
                        flag=1;
                        if(C.left!=null) {
                            if (C.left.data == data) {
                                return h+1;
                            }
                            else {
                               queue.add(C.left);
                            }
                       }
                       if(C.right!=null) {
                           if (C.right.data == data) {
                               return h+1;
                           }
                           else {
                               queue.add(C.right);
                           }
                       }
                    }
                    queue.remove();
                    size--;
                }
                if(flag==1){
                    h=h+1;
                }
                }
            }
            return h;
        }

      int find_diference_between_min_and_max_height_of_nodes_in_Binary_tree(Node root) {
        if(root==null){
            return -1;
        }
        Queue<Node> q = new LinkedList<Node>();
        Queue<Node> q1 = new LinkedList<Node>();
        q.add(root);
        //to get all leaf nodes into queue data structure
        while(q.size()>0){
            Node C=q.peek();
            if(!(C.left==null&&C.right==null)){
                q.remove();
                if(C.left!=null){
                    q.add(C.left);
                }
                if(C.right!=null){
                    q.add(C.right);
                }
            }
            else{
                q1.add(q.remove());
            }
        }
        int count=0;
        int min_height=0;
        int max_height=0;
        int height=0;
        while(q1.size()>0){
            if(count==0){
                Node D=q1.remove();
                height= find_height_of_node_in_binary_tree(D.data,root,1);
                min_height=height;
                max_height=height;
                count++;
            }
            else{
                count++;
                Node D=q1.remove();
                height= find_height_of_node_in_binary_tree(D.data,root,1);
                if(height<min_height){
                    min_height=height;
                }
                if(height>max_height){
                    max_height=height;
                }
            }
        }
        return max_height-min_height;
    }
    public static void main(String args[]){
        Balanced b=new Balanced();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);
        root.left.left.left.left=new Node(9);
        root.left.left.left.left.left=new Node(10);
        int c=b.find_diference_between_min_and_max_height_of_nodes_in_Binary_tree(root);
        if(c>1){
            System.out.println("Tree is unbalanced");
        }
        else{
            System.out.println("Tree is balanced");
        }
    }
}



