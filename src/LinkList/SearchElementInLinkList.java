package LinkList;

public class SearchElementInLinkList {

    public Node head;

    //add LinkList to first
    public void add(int data ){
        Node newNode = new Node(data);
        newNode.next = head;
        head =newNode;
    }

    public Boolean searchElement(int element){
        if(head==null){
            return false;
        }
        Node current = head;
        while(current!=null && current.id!=element){
            current =current.next;
        }
        if(current==null){
            return false;
        }else {
           return true;
        }
    }

    public Boolean SearchElementRecursively(Node head,int element){
        Node current = head;
        if(current==null){
            return false;
        }
        if(head.id==element && current!=null){
            return true;
        }

        return SearchElementRecursively(current.next,element);
    }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.println("{"+current.id+"}");
            current = current.next;
        }
    }

     public static void main(String args[]){

        SearchElementInLinkList object = new SearchElementInLinkList();
        object.add(10);
        object.add(20);
        object.add(30);
        object.display();
       /* System.out.println(object.searchElement(20));
         System.out.println(object.searchElement(40));
         System.out.println(object.searchElement(30));*/
         System.out.println(object.SearchElementRecursively(object.head,40));

    }




}
