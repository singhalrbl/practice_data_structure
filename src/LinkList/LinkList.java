package LinkList;
/**
 * LinkList
 */
public class LinkList {

    Node head;

    public void insertFirst(int id){
        Node n = new Node(id);
        n.next = head;
        head =n;
    }

    public void displayList(){
        Node current = head;
        while(current!=null){
            current.displayFirst();
            current =current.next;
        }

    }

    public void insertlast(int id){
        
        Node current =head;
        while(current.next!=null){
            current  = current.next;
        }
        Node n = new Node(id);
        current.next =n;
        n.next =null;

    }


    public static void main(String[] args) {
        
        LinkList l = new LinkList();
       
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        //l.displayList();
        l.insertlast(40);
        l.displayList();
        
        
    }
}