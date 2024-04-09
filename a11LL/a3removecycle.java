package a11LL;


public class a3removecycle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void print(Node head){
        if(head ==null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void removecyc(Node head){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while( fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        // find 2nd meeting point
        
        // slow = head;

        while(slow.next != fast.next ){
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;

    }


    public static void main(String args[]){
        Node head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = head;
        
        System.out.println(isCycle(head));
        removecyc(head);
        System.out.println(isCycle(head));

    }
}
