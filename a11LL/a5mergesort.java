package a11LL;
import java.util.LinkedList;

// import a11LL.LinkedList.Node;
import a11LL.a2cycleexist.node;

public class a5mergesort {
    
    public node findmid(node head){
        node slow = head;
        node fast = head.next;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public node merge(node head1, node head2){
        node Mergell = new node(-1);
        node temp = Mergell;

        while(head1 != null && head2 != null){
            if(head1.data<= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
            }
            else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return Mergell.next;
    }

    public node Meregesort(node head){
        if(head==null || head.next == null){
            return head;
        }
        // find mid
        node mid = findmid(head);
        // left & righthalf
        node righthalf = mid.next; //breaking
        mid.next =null;
        node newleft = Meregesort(head);
        node newright = Meregesort(righthalf);

        // merge
        return merge(newleft, newright);
    }
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println(ll);
        ll.head = ll.Meregesort(ll.head);
        System.out.println(ll);
        
    }
}

