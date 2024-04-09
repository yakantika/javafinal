package a13Queue;

// import javax.management.Query;

public class a2circularqueue {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1; //if both r -1
        }

        public static boolean isFull(){
            return (rear+1)% size == front; //if we try to increase read front will be right next
        }

        // add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            //add 1st elemnt
            if(front == -1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            int result = arr[front];

            // if only one elemnt is left
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1) % size;
            }

            return result;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
