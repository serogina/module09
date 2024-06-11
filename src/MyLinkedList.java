import java.util.Objects;

public class MyLinkedList <T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public T get(int index) {
        return node(index).value;
    }
    public int size(){
        return size;
    }
    public void remove(int index){
        Node<T>nodeToRemove = node(index);
        if (index == size-1){
            nodeToRemove.prev.next = null;
            tail = nodeToRemove.prev;
        } else if (index == 0){
            nodeToRemove.next.prev = null;
            head = nodeToRemove.next;
        }else{
            nodeToRemove.next.prev = nodeToRemove.prev;
            nodeToRemove.prev.next = nodeToRemove.next;
        }
        size --;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    private Node<T> node(int index){
        Objects.checkIndex(index,size);
        if(index == 0 && head != null){
            return head;
        }
        if(index == size-1 && tail != null){
            return tail;
        }
        Node<T>current = head;
        if (index < size/2){
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }else{
            current = tail;
            for (int i = size-1; i > index ; i--) {
                current = current.prev;
            }
        }
        return current;
    }
}
