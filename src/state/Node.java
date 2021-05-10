package state;

public class Node {
    private String naam;
    private Node nodeA;
    private Node nodeB;

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

    public Node(String naam) {
        this.naam = naam;
    }
    public Node getNext(String route){
        if (route.equals("A"))
            return nodeA;
        if (route.equals("B"))
            return nodeB;
        return null;
    }
}
