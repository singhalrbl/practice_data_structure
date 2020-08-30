package LinkList;

/**
 * Node
 */
public class Node {

    int id;
    Node next;

    public Node(int id) {

        this.id = id;

    }

    public void displayFirst() {
        System.out.println("{ " + id + " }");
    }
}