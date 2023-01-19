import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue<E> {
    private LinkedList<E> queue = new LinkedList<>();

    public void add(E item) {
        queue.add(item);
    }

    public E remove() {
        if(queue.size()==0) throw new NoSuchElementException();
        return queue.removeFirst();
    }

    public E peek() {
        if(queue.size()==0) throw new NoSuchElementException();
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
    }

    public boolean contains(E item) {
        return queue.contains(item);
    }

    public String toString() {
        return queue.toString();
    }
}
