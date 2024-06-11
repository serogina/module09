import java.util.Arrays;
public class MyArrayList <T> {
    private T[] data;
    private int size;

    public MyArrayList() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public void add(T value) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length*2);
        }
        data[size++] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index outside the array. Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public void clear() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index outside the array. Index: " + index + ", Size: " + size);
        }
        return (T) data[index] ;
    }

}

