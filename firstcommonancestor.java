//Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree
import java.util.*;class Node4{
    int data;
    Node4 left,right;
    public Node4(int item){
        data=item;
        left=null;
        right=null;

    }
}
    public class firstCommonAncestor {
        public Stack<Node4> find_path_of_node_from_root(Node4 root,Node4 A){
            if(root==null||A==null){
                return null;
            }
            Node4 temp=root;
            Node4 B=null;
            Node4 parent=null;//null
            Queue<Node4> q=new LinkedList<Node4>();
            HashMap<Node4,Node4> hm=new HashMap<Node4,Node4>();
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
                Node4 key=(Node4)iterator.next();
                Node4 value=(Node4)hm.get(key);
                if(value==null){
                    System.out.println("Key: " + key.data + ", Value: " + value);
                }
                else{
                    System.out.println("Key: " + key.data + ", Value: " + value.data);
                }
            }*/
           Stack<Node4> q1=new Stack<Node4>();
            Node4 X=hm.get(A);
            //System.out.println("first parent is" +X.data);
            //int count=10;
            while(X!=root){
                q1.push(X);//4 2
               /* if(X!=null) {
                    System.out.println("X data inserted into stack is " + X.data);
                }*/
                X=hm.get(X);
                /*if(X!=null) {
                    System.out.println("value in X is " + X.data);
                }*/

            }
            q1.push(X);
            //System.out.println("stack size is "+q1.size());
            Iterator it1=q1.iterator();
           /* while(it1.hasNext()&&it1.next()!=null){
                System.out.println("Element in stack is "+it1.next());
            }*/
            return q1;
        }
        Node4 find_common_ancestor_for_two_nodes(Stack s1,Stack s2,Node4 root){
            Iterator it=s1.iterator();
            int flag=0;
            Node4 temp=null;
            while(it.hasNext()){
                temp=(Node4)it.next();
                if(s2.contains(temp)){
                    if(temp!=root){
                        flag=1;
                        break;
                    }
                    else{
                        flag=2;
                    }
                }
            }
            if(flag==1) {
                return temp;
            }
            if(flag==2){
                return root;
            }
            return null;
        }
        public static void main(String args[]){
            firstCommonAncestor bt=new firstCommonAncestor();
            Node4 root=new Node4(3);
            root.left=new Node4(7);
            root.right=new Node4(5);
            root.left.left=new Node4(8);
            root.left.right=new Node4(0);
            root.right.left=new Node4(9);
            root.right.right=new Node4(1);
            Stack<Node4> q2=new Stack<Node4>();
            Stack<Node4> q3=new Stack<Node4>();
            q2=bt.find_path_of_node_from_root(root,root.left.left);
            q3=bt.find_path_of_node_from_root(root,root.left.right);
            Node4 N=bt.find_common_ancestor_for_two_nodes(q2,q3,root);
            if(N!=null){
                System.out.println("first common ancestor is "+N.data);
            }
            else{
                System.out.println("No ancestor");
            }
        }
    }

