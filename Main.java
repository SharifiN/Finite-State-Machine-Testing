package com.company;

public class Main {

    public static void main(String[] args) {
        Node S0 = new Node("S0");
        Node S1 = new Node("S1");
        Node S2 = new Node("S2");
        Node S3 = new Node("S3");



        S0.setNode(S1,"B");
        S0.setNode(S2,"A");
        S1.setNode(S1,"A");
        S1.setNode(S2,"B");
        S2.setNode(S3,"B");
        S3.setNode(S3,"A");
        S3.setNode(S3,"B");
        FSM fsm = new FSM(S0);
        fsm.run("ABBAB");


    }
}
