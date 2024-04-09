package a13Queue;

public class a3usingll {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =  null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        } 

        // add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){  //hread v wahi hoga tail v wahi hoga
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            // single elemnt left
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }

            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return head.data;
        }

    }

    


}
