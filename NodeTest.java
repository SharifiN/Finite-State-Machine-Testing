package com.company;

public class NodeTest {

    @org.junit.Test
    public void setNode() {
    }

    @org.junit.Test
    public void getNext() {
        Node S0 = new Node("S0");
        Node S1 = new Node("S1");
        Node S2 = new Node("S2");
        assertEquals(S1, S0.getNext("A"));
        assertEquals(S2, S0.getNext("B"));
    }

    private void assertEquals(Node s1, Node a) {

    }

}
   

    