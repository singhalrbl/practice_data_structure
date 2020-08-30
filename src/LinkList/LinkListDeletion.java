package LinkList;


/**
 * LinkListDeletion
 */
public class LinkListDeletion {

    Node head;

    /*Insert the elemnt at front */
    public void push(int node_data){
        Node new_node = new Node(node_data);
        new_node.next = head;
        head = new_node;  
    }

    public void insertLast(int node_data){



        
    }

   public void deleteById(int key ){

    Node current = head;
    Node previous =null;

    if(current!=null && current.id==key){
        current =current.next;
        return;
    }

    while(current!=null && current.id !=key){
        previous = current;
        current = current.next;
    }
    previous.next = current.next;
    return;
   }

   public void displayLinkedList(){

    Node current =head;
    while(current!=null){
        System.out.println(current.id);
        current =current.next;
    }


   }




    public static void main(String[] args) {
        LinkListDeletion object = new LinkListDeletion();
        object.push(10);
        object.push(20);
        object.push(30);
        //object.displayLinkedList();
        object.deleteById(10);
        object.displayLinkedList();
        
    }
}