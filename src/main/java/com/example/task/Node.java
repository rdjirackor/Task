//package com.example.task;
//
//
//public class Node implements Comparable<Node> {
//    public int x, y;
//    public int gCost;
//    public int hCost;
//    public Node parent;
//
//    public Node(int x, int y, Node parent) {
//        this.x = x;
//        this.y = y;
//        this.parent = parent;
//    }
//
//
//    public int fCost() {
//        return gCost + hCost;
//    }
//
//    @Override
//    public int compareTo(Node other) {
//        return Integer.compare(this.fCost(), other.fCost());
//    }
//}
//
