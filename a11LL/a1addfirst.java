package a11LL;

public class a1addfirst {
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
    public static int size;

    public void addfirst(int data){
        // step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head;  //link

        // step3 - head = newNode
        head = newNode;
    }

    public void addlast(int data){
        Node neunode = new Node(data);
        size++;

        if(head == null){
            head = tail = null;
            return;
        }

        tail.next = neunode;
        tail = neunode;
    }

    public void print(){
        if(head==null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        //when the idx will be 0 will call addfirst func
        if(idx==0){
            addfirst(data);
            return;
        }

        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next= newnode;
    } 

    public int removefirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return -1;
        }else if(size ==1){
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }

        int val =head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev :  i= size-2       
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itterSearch(int key){
        Node temp = head;
        int idx=0;

        while(temp!=null){
            if(temp.data == key){ //key found
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1; // key not found
    }

    public int helper(Node head, int key, int i){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return i;
        }

        return helper(head.next, key, i++);
    }

    public int recSearch(int key){
        return helper(head,key,0);
    }

    //reverse a LL
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // find and removie nth node from end
    public void nthremove(int n){
        int sz=0;
        Node temp=head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){  //want to remove the head 
            head = head.next;
            return;
        }

        int i=1; 
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

    }

    // check if a ll is palindrome of not
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // find mid
        Node mid = findMid(head);

        // reverse the ll
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }

    
    public static void main(String args[]){
        a1addfirst ll = new a1addfirst();
        // ll.print();
        // ll.addfirst(1);
        // ll.print();
        // ll.addfirst();
        // ll.print();
        // ll.addlast(3);
        // ll.print();
        // ll.addlast(4);
        // ll.add(2,9);
        // ll.print();
        // System.out.println(size);
        // ll.removefirst();
        // ll.print();
        // ll.removelast();
        // ll.print();
        // System.out.println(size);
        // System.out.println(ll.itterSearch(9));
        // System.out.println(ll.itterSearch(9));
        // ll.reverse();
        // ll.print();
        // ll.nthremove(1);
        // ll.print();


        // for palindrome
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();

        System.out.println(ll.isPalindrome());
        
    }

}
