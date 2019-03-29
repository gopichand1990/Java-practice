import java.util.*;
//In a Binary Tree, Create Linked Lists of all the nodes at each depth.
class Node2{
    int data;
    Node2 left,right,next;
    public Node2(int item){
        data=item;
        left=null;
        right=null;
        next=null;
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
    public class creteLinkedlist {
         void Print_linkedlists_at_each_level_in_binary_tree(Node2 root) {
            if (root == null) {
                return;
            }
            Queue<Node2> q = new LinkedList<Node2>();
            q.add(root);
            System.out.println("q.peek() " + ((Node2) q.peek()));
            ArrayList<Node2> al = new ArrayList<Node2>();
            while (!q.isEmpty()) {
                int m = q.size();
                System.out.println("size of array before entering into while loop " + m);
                Node2 head = null;
                Node2 temp = null;
                while (m > 0) {
                    if (q.size() > 0) {
                        Node2 B = q.remove();
                        System.out.println("queue size is " + q.size());

                        if (B.left != null) {
                            q.add(B.left);
                        }
                        if (B.right != null) {
                            q.add(B.right);
                        }
                        if (head == null) {
                            head = B;
                            temp = B;
                        }
                        else {
                            temp.next = B;
                            temp = temp.next;
                        }

                        al.add(head);
                    }
                    m--;
                    System.out.println("end of first method");
                }

                }
            display(al);
            System.out.println("al size is "+al.size());
            }

    //}
             void display(ArrayList<Node2> al) {
              System.out.println("size is "+al.size());
                for (int i = 0; i < al.size(); i++) {
                    Node2 head = (Node2) al.get(i);
                    while (head != null) {
                        System.out.print(head.data);
                        System.out.print("->");
                        head = head.next;

                    }
                    System.out.println("space");
                }
            }
        public static void main(String[] args){
            Node2 root=new Node2(3);
            root.left=new Node2(7);
            root.right=new Node2(5);
            root.left.left=new Node2(8);
            root.left.right=new Node2(0);
            root.right.left=new Node2(9);
            root.right.right=new Node2(1);
            root.Print_linkedlists_at_each_level_in_binary_tree(root);
        }
    }



