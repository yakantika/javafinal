package a11LL;

import org.w3c.dom.Node;

public class a6doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
        
        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node head;
    public static Node prev;

    // insert at first
    public void addFirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        newnode.prev = null;
        
        if(head != null){
            head.prev = newnode;
        }

        head = newnode;
    }

    // print
    public void printll(){
        Node node = head;
        Node last = null;

        while(node!=null){
            System.out.print(node.data+"->");
            last = node;
            node = node.next;
        }
        System.out.println("null");

        System.out.println("reverse the ll");
        // print reverse
        while(last != null){
            System.out.print(last.data+"->");
            last = last.prev;
        }
        System.out.println("null");

    }

    public void addlast(int data){
        Node newnode = new Node(data);
        Node last = head;
        newnode.next = null;

        if(head == null){
            newnode.prev = null;
            head = newnode;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = newnode;
        newnode.prev = last;
    }

    // insert at perticular index
        // first find the value
    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.data == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

        //now inserting
    public void insertafter(int after, int data){
        Node p = find(after);
        if(p == null){
            System.out.println("value doesn't exist");
            return;
        }

        Node newnode = new Node(data);
        newnode.next = p.next;
        p.next = newnode;
        newnode.prev = p;
        if(newnode.next != null){
            newnode.next.prev = newnode;
        }
        
    } 

    public static void main(String args[]){
        a6doublyll ll = new a6doublyll();
        // ll.printll();
        ll.addFirst(1);
        // ll.printll();
        ll.addFirst(2);
        // ll.printll();
        ll.addFirst(3);
        // ll.printll();
        ll.addFirst(4);
        // ll.printll();
        ll.addlast(99);
        ll.printll();
        ll.insertafter(2,56);
        ll.printll();

    }
}
