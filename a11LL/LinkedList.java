package a11LL;
package 11LL;

public class LinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    
    public static Node head;
    public static Node tail;
    
    public static void main(String args[]){
        Node newnode = new Node(1);
    }

}
