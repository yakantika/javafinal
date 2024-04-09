package a11LL;

public class a7circularll {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public void insert(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }

    // print
    public void printcll(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.data+"->");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.println("head");

    }

    // delete node
    public void delete(int value){
        Node temp = head;
        if(temp == null) return;

        if(temp.data == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = temp.next;
            if(n.data == value){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp!= head);
    }

    public static void main(String args[]){
        a7circularll ll = new a7circularll();

        ll.insert(0);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.printcll();
        ll.delete(3);
        ll.printcll();

    }

}
