package LinkList;

import java.util.HashSet;
import java.util.Set;

class DetectALoopInLinkList {

    public Node head;

    //add at o(1) complexity
    public void add(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.id);
            current = current.next;
        }
    }

    //Two Pointer algorithum
  /*  public Boolean CheckLoopLinkList(Node head) {

        Node fast_ptr = head;
        Node slow_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
            if (fast_ptr == slow_ptr) {
                return true;
            }
        }
        return false;
    }*/

    public Boolean CheckLoopLinkList(Node head){
        Node current = head;
        Set<Node> check  = new HashSet<Node>();
        while(current.next!=null){
            if(check.contains(current)){
                return true;
            }else{
                check.add(current);
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String args[]) {

        DetectALoopInLinkList object = new DetectALoopInLinkList();
        object.add(10);
        object.add(20);
        object.add(30);
        object.add(40);
        object.add(50);
        object.add(60);

        //object.head.next.next.next = object.head.next;

        System.out.println(object.CheckLoopLinkList(object.head));
    }
}