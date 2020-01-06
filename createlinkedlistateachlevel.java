import java.util.*;
//In a Binary Tree, Create Linked Lists of all the nodes at each depth.
class Tree_node{
    int data;
    Tree_node left,right;
    public Tree_node(int item){
        data=item;
        left=null;
        right=null;
       // next=null;
    }
}
/*class Linkedlist{
    int data;
    Node next;
    public Linkedlist(int item){
        data=item;
        next=null;
    }
}*/
    public class creteLinkedlist {
        static void Print_linkedlists_at_each_level_in_binary_tree(Tree_node root) {
            if (root == null) {
                return;
            }
            Queue<Tree_node> q = new LinkedList<Tree_node>();
            q.add(root);
            System.out.println("q.peek() " + ((Tree_node) q.peek()));	
            while (!q.isEmpty()) {//2
			HashMap<Tree_node,Tree_node> hm=new HashMap<Tree_node,Tree_node>;
                int m = q.size();//1
                System.out.println("size of array before entering into while loop " + m);
                Tree_node head = null;
                Tree_node temp = null;
                while (m > 0) {
                    if (q.size() > 0) {
                        Tree_node B = q.remove();//2
                        System.out.println("queue size is " + q.size());

                        if (B.left != null) {//3
                            q.add(B.left);
                        }
                        if (B.right != null) {//3 4
                            q.add(B.right);
                        }
                        if (head == null) {
                            head = B;//2
                            temp = B;//2
                        }
                        else {
                           /* temp.next = B;
                            temp = temp.next;*/
							hm.put(temp,B);//2 3, 3 4
						     temp=B;//4
                        } 
                    }
					display(head,hm);
                    m--;
                    System.out.println("end of first method");
                }
                }
            }

    //}
             void display(Tree_node A,HashMap hm) {
                System.out.ptintln(head->data);
				Tree_node temp1=head;//2
				while(hm.get(temp1)!=null){
				   System.out.println("-->");
				   System.out.println(hm.get(temp1).data);
				   temp1=temp1.get(temp1);
                    }
                }
            }
        public static void main(String[] args){
            Tree_node k=new Tree_node(3);
            root.left=new Tree_node(7);
            root.right=new Tree_node(5);
            root.left.left=new Tree_node(8);
            root.left.right=new Tree_node(0);
            root.right.left=new Tree_node(9);
            root.right.right=new Tree_node(1);
            k.Print_linkedlists_at_each_level_in_binary_tree(root);
        }
    }



