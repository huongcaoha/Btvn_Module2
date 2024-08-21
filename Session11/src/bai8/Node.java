package bai8;

public class Node<E> {
    private Node<E> next ;
    private Object data ;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }
    public Object getData(){
        return  this.data ;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
