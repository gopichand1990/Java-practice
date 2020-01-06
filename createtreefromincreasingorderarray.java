/*Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.*/
import java.util.*;
class Tree_node{
    int data;
    Tree_node left,right;
    public Tree_node(int item){
        data=item;
        left=null;
        right=null;
    }
}
public class Btree {
    Tree_node root;
    //parameterised constructor
    Btree(int key){
        root=new Tree_node(key);
    }
    //default constructor
    Btree(){
        root=null;
    }
    Queue<Tree_node> s=new LinkedList<Tree_node>();//empty
    void print_level_order_traversal(Tree_node A){
        if(A==null){//1
            return;
        }
        //System.out.println("Before" +s.size());
        if(s.size()>=0){
            s.add(A);//stack 1/1
        }
        while(s.size()>0){
            Tree_node S=s.remove();
            System.out.println("Node data is "+S.data); //Printed data:1 2
            if(S.left!=null){
                s.add(S.left);//queue=2
            }
            if(S.right!=null){
                s.add(S.right);//queueu=2 3
            }
        }
    }
        Tree_node create_tree_from_sorted_array(int[] a,int start_index,int end_index){
		  if(end_index<start_index){
		    return;
			}
            int len=a.length;
            int mid=len/2;
            Tree_node root=new Tree_node(a[mid]);
			root->left=create_tree_from_sorted_array(a,0,mid-1);
			root->right=create_tree_from_sorted_array(a,mid+1,len);
			return root;
		}
           /* Tree_node c=root;
            Tree_node b=root;
            int i=mid-1;
            while(i>=0){
                c.left=new Tree_node(a[i]);
                i--;
                c=c.left;
            }
            int j=mid+1;
            while(j<len){
                b.right=new Tree_node(a[j]);
                j++;
                b=b.right;
            }
            return root;
        }*/
        public static void main(String args[]){
            int a[]={1,2,3,4,5,6,7,8,9,10};
            System.out.println("length is"+a.length);
            Btree c=new Btree();
            Tree_node A= c.create_tree_from_sorted_array(a);
            c.print_level_order_traversal(A);
            //System.out.println(A.data);
        }

}

