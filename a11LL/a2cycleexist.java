package a11LL;

public class a2cycleexist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;



    public void addfirst(int data){
        // step1 = create new node
        Node newNode = new Node(data);
        // size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head;  //link

        // step3 - head = newNode
        head = newNode;
    }

    public static void isCycle(Node head){
        Node slow = head;
        Node fast = head;
        

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                Node temp = slow;
                int count = 0;
                do{
                    temp = temp.next;
                    count++;
                }while(temp != slow);
                // return true;
                System.out.println(count);
            }
        }

        // return false;
    }


    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        // a2cycleexist ll = new a2cycleexist();
        // ll.addfirst(0);

        // System.out.println(isCycle(head));
        isCycle(head);

    }

}
