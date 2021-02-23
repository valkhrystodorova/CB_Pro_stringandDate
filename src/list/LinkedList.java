package list;

import java.util.NoSuchElementException;

public class LinkedList {

    Node first;

    Node last;
    int size;

    public void addLast(Integer value) {
        Node n = last;
        Node newNode = new Node(n, value, null);
        last = newNode;
        if (n == null) {
            first = newNode;
        } else n.next = newNode;
        size++;
    }
    public void addFirst (Integer value){
        Node n = first;
        Node newNode = new Node(null, value, n);
        first = newNode;
        if (n== null){
            last = newNode;
        }else n.prev = newNode;
        size ++;

    }
    public Node getFirst(){
        Node f = first;
        if (f == null){
            throw new NoSuchElementException();
        }
        else return f;
    }
    public Node getLast (){
        Node l = last;
        if(l == null){
            throw new NoSuchElementException();
        }
        else return l;
    }

    public void removeFirst (){
        Node f = first;
        if (f == null){
            throw new NoSuchElementException();
        }
        else{
            first = f.next;
            first.prev = null;
            size --;
        }
    }

    public void removeLast() {
        Node l = last;
        if (l == null){
            throw new NoSuchElementException();
        }else {
            last = l.prev;
            last.next = null;
            size --;
        }
    }

    public int size() {
        return size;
    }


    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        if (first == null) {
            return "{}";
        }
        Node currentNode = first;
        stringBuilder.append("{");
        while (currentNode.next != null) {
            stringBuilder.append(currentNode.toString()).append(", ");
            currentNode = currentNode.next;
        }
        stringBuilder.append(currentNode.toString()).append("}");
        return stringBuilder.toString();
    }

    private static class Node {

        public Node(Node prev, Integer value, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        Integer value;
        Node next;
        Node prev;

        public String toString() {
            return "Node value is " + value;
        }

    }
}
