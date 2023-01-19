import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
    private ArrayList<E> stack = new ArrayList<>();

    public E push(E item) {
        stack.add(item);
        return item;
    }

    public E pop() {
        if(stack.size()==0) throw new EmptyStackException();
        return stack.remove(stack.size()-1);
    }

    public E peek() {
        if(stack.size()==0) throw new EmptyStackException();
        return stack.get(stack.size()-1);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
    // stack의 타입 E에 따라 의도대로 작동시키기 위해 equals 메서드를 오버라이딩 해줘야 함.
    public int search(Object o) {
        for(int i=0; i<stack.size(); i++) {
            if(stack.get(i).equals(o)) return i+1;
        }
        return -1;
    }

    public int size() {
        return stack.size();
    }

    public String toString() {
        return stack.toString();
    }

    public void clear() {
        stack.clear();
    }

    public boolean contains(E item) {
        return stack.contains(item);
    }
}
