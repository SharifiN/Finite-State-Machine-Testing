package com.company;
import java.util.HashMap;


public class Node {
    private String naam;
    HashMap<String, Node> Nodes = new HashMap<String, Node>();

    public void setNode(Node node, String key) {
        this.Nodes.put(key, node);
    }

    public Node(String naam) {
        this.naam = naam;
    }

    public Node getNext(String route) {
        if (route.equals("A"))
            return Node;
        if (route.equals("B"))
            return Node;
        return null;
        return Nodes.get(route);
    }



}

