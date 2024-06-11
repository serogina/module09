import java.util.Arrays;

public class MyStack <T>{
    private T[] data;
    private int size;

    public MyStack() {
        data = (T[]) new Object[10];
        size = 0;
    }

    //додає елемент в кінець
    public void push(T value){
        if (size==data.length){
            data = Arrays.copyOf(data,size*2);
        }
        data[size++] = value;
    }

    //видаляє елемент за індексом
    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index outside the array. Index: " + index + ", Size: " + size);
        }
        for (int i = index; i <= size; i++) {
            data[i] = data[i+1];
        }
        data[size-1]=null;
        size--;
    }
    //очищає колекцію
    public void clear(){
        data = (T[]) new Object[10];
        size = 0;
    }
    //size() повертає розмір колекції
    public int size(){
        return size;
    }
    //peek() повертає перший елемент стеку
    public T peek(){
        if (size==0){
            throw new IndexOutOfBoundsException("Array is empty.  Size: " + size);
        }
        return data[0];
    }
    //pop() повертає перший елемент стеку та видаляє його з колекції
    public T pop(){
        if (size==0){
            throw new IndexOutOfBoundsException("Array is empty.  Size: " + size);
        }
        T firstelement = data[0];

        for (int i = 0; i < size; i++) {
            data[i] = data[i+1];
        }

        data[size-1] = null;
        size--;

        return firstelement;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
