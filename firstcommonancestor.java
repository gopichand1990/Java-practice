//Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree
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
    public class firstCommonAncestor {
        public Queue<Tree_node> find_path_of_node_from_root(Tree_node root,Tree_node A){
            if(root==null||A==null){
                return null;
            }
            Tree_node temp=root;
            Tree_node B=null;
            Tree_node parent=null;//null
            Queue<Tree_node> q=new LinkedList<Tree_node>();
            HashMap<Tree_node,Tree_node> hm=new HashMap<Tree_node,Tree_node>();
            q.add(root);//1
            hm.put(root,parent);
            while(q.size()>0){
                B=q.remove();
                parent=B;
                if(B.left!=null){
                    q.add(B.left);
                    hm.put(B.left,parent);
                }
                if(B.right!=null){
                    q.add(B.right);
                    hm.put(B.right,parent);
                }
            }
            /*Set setOfKeys = hm.keySet();
            Iterator iterator=setOfKeys.iterator();
            while(iterator.hasNext()){
                Tree_node key=(Tree_node)iterator.next();
                Tree_node value=(Tree_node)hm.get(key);
                if(value==null){
                    System.out.println("Key: " + key.data + ", Value: " + value);
                }
                else{
                    System.out.println("Key: " + key.data + ", Value: " + value.data);
                }
            }*/
           Queue<Tree_node> q1=new LinkedList<Tree_node>();
            Tree_node X=hm.get(A);
            //System.out.println("first parent is" +X.data);
            //int count=10;
            while(X!=root){
                q1.add(X);//4 2
               /* if(X!=null) {
                    System.out.println("X data inserted into stack is " + X.data);
                }*/
                X=hm.get(X);
                /*if(X!=null) {
                    System.out.println("value in X is " + X.data);
                }*/

            }
            q1.add(X);
            //System.out.println("stack size is "+q1.size());
            Iterator it1=q1.iterator();
           /* while(it1.hasNext()&&it1.next()!=null){
                System.out.println("Element in stack is "+it1.next());
            }*/
            return q1;
        }
        Tree_node find_common_ancestor_for_two_nodes(Queue q1,Queue q2,Tree_node root){
            Iterator it=q1.iterator();
            int flag=0;
            Tree_node temp=null;
            while(it.hasNext()){
                temp=(Tree_node)it.next();
                if(s2.contains(temp)){
                    flag=1;
					break;
                }
            }
            if(flag==1) {
                return temp;
            }
           else{
		     return root;
			 }
        }
        public static void main(String args[]){
            firstCommonAncestor bt=new firstCommonAncestor();
            Tree_node root=new Tree_node(3);
            root.left=new Tree_node(7);
            root.right=new Tree_node(5);
            root.left.left=new Tree_node(8);
            root.left.right=new Tree_node(0);
            root.right.left=new Tree_node(9);
            root.right.right=new Tree_node(1);
            Stack<Tree_node> q2=new Stack<Tree_node>();
            Stack<Tree_node> q3=new Stack<Tree_node>();
            q2=bt.find_path_of_node_from_root(root,root.left.left);
            q3=bt.find_path_of_node_from_root(root,root.left.right);
            Tree_node N=bt.find_common_ancestor_for_two_nodes(q2,q3,root);
            if(N!=null){
                System.out.println("first common ancestor is "+N.data);
            }
            else{
                System.out.println("No ancestor");
            }
        }
    }

