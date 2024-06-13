import java.util.Objects;

public class MyQueue <T> {
    private MyQueue.Node<T> head;
    private MyQueue.Node<T> tail;
    private int size;
    private static class Node<T> {
        T value;
        MyQueue.Node<T> next;
        MyQueue.Node<T> prev;

        Node(T value) {
            this.value = value;
        }
    }

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value){
        Node<T>newNode = new Node<>(value);
        if (head == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    //повертає ЗНАЧЕННЯ! першого елемента з черги
    public T peek(){
        return head.value;
    }

    public int size(){
        return size;
    }

    //повертає ЗНАЧЕННЯ! першого елементу з черги і видаляє його з колекції
    public T poll(){
        Objects.checkIndex(0,size);
        Node<T>firstNode = head;
        head.next.prev = null;
        head = head.next;
        size--;
        return firstNode.value;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "head=" + head.value +
                ", tail=" + tail.value +
                ", size=" + size +
                '}';
    }
}
