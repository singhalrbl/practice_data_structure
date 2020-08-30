package LinkList;

/**
 * MiddleOfLinkList
 */
public class MiddleOfLinkList {

    Node head;

    //add data to the last
    public void add(int data){

        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.println("{"+current.id+"}");
            current = current.next;
        }
    }

    public Node findMiddle(){

        Node current  = head;
        Node reference = head;

        while(reference!=null && reference.next!=null){
            current = current.next;
            reference  = reference.next.next;
        }

        return current;
    }




    public static void main(String[] args) {

        MiddleOfLinkList object = new MiddleOfLinkList();
        object.add(10);
        object.add(20);
        object.add(30);
        object.add(40);
         //object.add(50);
        object.display();
        Node retrunData =object.findMiddle();
        System.out.println(retrunData.id);

        
    }
}