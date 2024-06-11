import java.security.Key;
import java.util.Arrays;

public class MyHashMap <K,V>{
    private static final int DEFAULT_SIZE = 8;
    private Entry<K,V>[] context = new Entry[DEFAULT_SIZE];
    private int size;

    public MyHashMap() {
        context = new Entry[DEFAULT_SIZE];
        size = 0;
    }

    public void put(K key, V value){
        int index = calculateIndex(key.hashCode());
        Entry<K,V> newEntry = new Entry<>(key, value);
        if (context[index] == null){
            context[index] = newEntry;
            size++;
        } else {
            Entry<K, V> entry = context[index];
            while (entry != null) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
                if (entry.next == null) {
                    entry.next = newEntry;
                    size++;
                    return;
                }
                entry = entry.next;
            }
        }
    }
    public V get(K key){
        int index = calculateIndex(key.hashCode());
        if (context[index].key.equals(key)){
            return context[index].value;
        } else {
            //iterate linked list and compare with equals
            Entry<K, V> entry = context[index];
            while (entry != null) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
                entry = entry.next;
            }
        }
        return null;
    }

    public int size(){
        return size;
    }
    public void remove(K key){
        int index = calculateIndex(key.hashCode());
        Entry<K, V> entry = context[index];
        Entry<K, V> prevEntry = null;
        while (entry != null) {
            if (entry.key.equals(key)) {
                if (prevEntry == null){
                    context[index] = entry.next;
                } else {
                    prevEntry.next = entry.next;
                }
                size--;
            }
            prevEntry = entry;
            entry = entry.next;
        }
    }
    public void clear(){
        context = new Entry[DEFAULT_SIZE];
        size = 0;
    }
    private int calculateIndex(int hashCode) {
        return Math.abs(hashCode % context.length);
    }

    @Override
    public String toString() {
        String result="";
        for (Entry<K,V> entry:context) {
            result = result + "{";
             Entry<K, V> nextEntry = entry;
             while (nextEntry != null) {
                result = result+"[key-"+nextEntry.key+" value-"+nextEntry.value+"]";
                nextEntry = nextEntry.next;
            }
             result = result+"}"+"\n";
        }
        return result;
    }

    private static class Entry<K,V>{
        private K key;
        private V value;
        private Entry<K,V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
