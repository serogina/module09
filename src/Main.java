import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("==================  ArrayList  ==========================");
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("125");
        System.out.println("Element at index 0: " + list.get(2));
        //System.out.println("Element at index 10: " + list.get(10));
        System.out.println("Size: " + list.size());
        //list.remove(10);
        list.remove(2);
        System.out.println("Element at index 0 after removal: " + list.get(0));
        System.out.println("Size after removal: " + list.size());
        list.clear();
        System.out.println("Size after clear: " + list.size());

        System.out.println("==================  linkedList  ==========================");
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Hello");
        linkedList.add("from");
        linkedList.add("Linked");
        linkedList.add("List");
        linkedList.add("!");
        linkedList.add("123");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));

        linkedList.remove(5);
        linkedList.remove(0);
        linkedList.remove(1);
        System.out.println("past remove");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println("linkedList size " + linkedList.size());
        linkedList.clear();
        System.out.println("linkedList size " + linkedList.size());

        System.out.println("==================  Queue  ==========================");
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("Hello");
        myQueue.add("from");
        myQueue.add("Queue");
        myQueue.add("!");
        myQueue.add("!!");
        System.out.println("myQueue = " + myQueue);
        System.out.println("peek "+ myQueue.peek());
        System.out.println("poll "+ myQueue.poll());
        System.out.println("After poll " + myQueue);
        myQueue.clear();
        System.out.println("After clear size=" + myQueue.size());

        System.out.println("==================  Stack  ==========================");
        MyStack<String> stack = new MyStack<>();
        stack.push("Hello");
        stack.push("from");
        stack.push("Stack");
        stack.push("!");
        stack.push("!!");
        System.out.println("stack = " + stack);

        System.out.println("stack.pop = "+stack.pop());
        System.out.println("stack.peek = " + stack.peek());
        System.out.println("stack = " + stack);

        stack.remove(3);
        stack.remove(1);
        stack.remove(0);
        System.out.println("stack after remove = " + stack);
        
        stack.clear();
        System.out.println("stack.size() = " + stack.size());

        System.out.println("==================  HashMap  ==========================");
        MyHashMap<String,String> hashMap = new MyHashMap<>();
        hashMap.put("1","eins");
        hashMap.put("2","zwei");
        hashMap.put("3","drei");
        hashMap.put("4","vier");
        hashMap.put("5","fünf");
        hashMap.put("6","sechs");
        hashMap.put("7","sieben");
        hashMap.put("8","aucht");
        hashMap.put("9","neun");
        hashMap.put("10","zehn");
        hashMap.put("11","elf");
        hashMap.put(null,"null");
        System.out.println("hashMap = " + hashMap);
        System.out.println("hashMap.get(null) = " + hashMap.get(null));
        System.out.println("hashMap.get(145) = " + hashMap.get("145"));
        System.out.println("hashMap.size() = " + hashMap.size());
        hashMap.remove("1");
        hashMap.remove(null);
        hashMap.remove("5");
        hashMap.remove("11");
        hashMap.remove("15");
        System.out.println("hashMap = " + hashMap);
        hashMap.clear();
        System.out.println("hashMap.size() = " + hashMap.size());  
    }
}