package state;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    @Test
    public void getNext() {
        Node S0 = new Node("S0");
        Node S1 = new Node("S1");
        Node S2 = new Node("S2");
        S0.setNodeA(S1);
        S0.setNodeB(S2);
        assertEquals(S1,S0.getNext("A"));
        assertEquals(S2,S0.getNext("B"));

    }
}