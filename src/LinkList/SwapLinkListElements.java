package LinkList;

/**
 * SwapLinkListElements
 */
public class SwapLinkListElements {

    Node head;
    //o(1)
    public void add(int data){
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;        
    }
    
    public void addAfter(int data){
        Node current =head;
        Node newNode =new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        while(current.next!=null){
            current = current.next;
        }
        current.next =newNode;
        
    }

    public void display(){

        Node current =head;
        while(current!=null){
            System.out.println(current.id);
            current = current.next;
        }

    }

    public void swapNodes(int x , int y, Node head){

       /*  Node current = head;
        Node prev =null;

        Node current2 =head;
        Node prev2 =null;

        Node temp=null;

        while(current.next!=null){
            if(current.id==node1){
                break;
            }
            prev =current;
            current =current.next;
        }

        while(current2.next!=null){
            if(current2.id==node2){
                break;
            }
            prev2 =current2;
            current2 =current2.next;
        }

        //swap
        temp = prev;
        System.out.println(temp.id);
        prev.next = prev2.next;
        prev2.next = temp.next;
 */

if (x == y) {
return; 
}
// Search for x (keep track of prevX and CurrX) 
Node prevX = null, currX = head; 
while (currX != null && currX.id != x) 
{ 
    prevX = currX; 
    currX = currX.next; 
} 

// Search for y (keep track of prevY and currY) 
Node prevY = null, currY = head; 
while (currY != null && currY.id != y) 
{ 
    prevY = currY; 
    currY = currY.next; 
} 

// If either x or y is not present, nothing to do 
if (currX == null || currY == null) 
    return; 

// If x is not head of linked list 
/* if (prevX != null) 
    prevX.next = currY; 
else //make y the new head 
    head = currY; 
 */
// If y is not head of linked list 
if (prevY != null) 
    prevY.next = currX; 
else // make x the new head 
    head = currX; 

// Swap next pointers 
Node temp = currX.next; 
currX.next = currY.next; 
currY.next = temp; 

        //return head;


    }

    public static void main(String[] args) {

        SwapLinkListElements object = new SwapLinkListElements();
        object.addAfter(10);
        object.addAfter(20);
        object.addAfter(30);
        object.addAfter(40);
        System.out.println("Before swapping");
        object.display();
        object.swapNodes(20,40,object.head);
        System.out.println("After swapping");
        object.display();
        
    }

}