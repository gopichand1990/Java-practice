/*Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.*/
import java.util.*;
class Node1{
    int data;
    Node1 left,right;
    public Node1(int item){
        data=item;
        left=null;
        right=null;
    }
}
public class Btree {
    Node1 root;
    //parameterised constructor
    Btree(int key){
        root=new Node1(key);
    }
    //default constructor
    Btree(){
        root=null;
    }
    Queue<Node1> s=new LinkedList<Node1>();//empty
    void print_level_order_traversal(Node1 A){
        if(A==null){//1
            return;
        }
        //System.out.println("Before" +s.size());
        if(s.size()>=0){
            s.add(A);//stack 1/1
        }
        while(s.size()>0){
            Node1 S=s.remove();
            System.out.println("Node data is "+S.data); //Printed data:1 2
            if(S.left!=null){
                s.add(S.left);//queue=2
            }
            if(S.right!=null){
                s.add(S.right);//queueu=2 3
            }
        }
    }
        Node1 create_tree_from_sorted_array(int[] a){
            int len=a.length;
            int mid=len/2;
            Node1 root=new Node1(a[mid]);
            Node1 c=root;
            Node1 b=root;
            int i=mid-1;
            while(i>=0){
                c.left=new Node1(a[i]);
                i--;
                c=c.left;
            }
            int j=mid+1;
            while(j<len){
                b.right=new Node1(a[j]);
                j++;
                b=b.right;
            }
            return root;
        }
        public static void main(String args[]){
            int a[]={1,2,3,4,5,6,7,8,9,10};
            System.out.println("length is"+a.length);
            Btree c=new Btree();
            Node1 A= c.create_tree_from_sorted_array(a);
            c.print_level_order_traversal(A);
            //System.out.println(A.data);
        }

}

