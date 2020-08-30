package LinkList;

/**
 * linkListGeeks
 */
public class LinkListGeeks {

    NodeData head;

    public  void display(){

        NodeData current = head;
        while(current!=null){
            System.out.println(current.id);
            current = current.next;
        }

    }


    static class NodeData{

       public  int id ;
       public  NodeData next;

        public NodeData(int id){
            this.id =id;
        }


    }

    public static void main(String[] args) {

        LinkListGeeks linkList = new LinkListGeeks();
       
        linkList.head = new NodeData(50);
        NodeData second = new NodeData(60);
        NodeData third = new NodeData(70);


        linkList.head.next =second;
        second.next = third; 

        linkList.display();



        
    }

    
}