package LinkList;

/**
 * DeleteNodeOnValue
 */
public class DeleteNodeOnValue {

    Node head;

    public void add(int data){
        Node new_node = new Node(data);
        new_node.next =head;
        head =new_node;
    }

    public void display(Node head){
        Node current =head;
        while(current!=null){
            System.out.println(current.id);
            current =current.next;
        }
    }

    public Node deleteNode(Node head,int val){
        Node current = head;
        Node prev = head;
        if(head==null){
            return head;
        }

        /* if(current!=null && current.id==val){
            head =current.next;
        } */

        while(current!=null){
            if(current.id==val){
              prev.next =current.next;
            }
              prev =current;
              current =current.next;
        }
       // prev.next =null;
        return head.id==val ? head: head;
    }

    public static void main(String[] args) {
        
        DeleteNodeOnValue object = new DeleteNodeOnValue();
        object.add(1);
         object.add(1);
        object.add(4);
     /*   object.add(3);
        object.add(6);
        object.add(2);
        object.add(1); */
       // object.display();
        
        object.display(object.deleteNode(object.head, 1));

    }

}