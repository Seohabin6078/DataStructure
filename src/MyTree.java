import java.util.ArrayList;

public class MyTree<E> {
    private E value;
    private ArrayList<MyTree<E>> children;

    public MyTree() {
        value = null;
        children = null;
    }

    public MyTree(E data) {
        this.value = data;
        children = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public void addChildNode(MyTree<E> node) {
        if(children==null) children = new ArrayList<>();
        children.add(node);
    }

    // 이건 나중에 반복해서 다시 구현해보기!
    public void removeChildNode(MyTree<E> node) {
        E data = node.getValue();

        if(children != null) {
            for(int i=0; i<children.size(); i++) {
                if(children.get(i).getValue().equals(data)) {
                    children.remove(i);
                    return;
                }
                if(children.get(i).children != null) children.get(i).removeChildNode(node);
            }
        }
    }

    public ArrayList<MyTree<E>> getChildren() {
        return children;
    }

    public boolean contains(E data) {
        if(value.equals(data)) return true;

        if(children != null) {
            for(int i=0; i<children.size(); i++) {
                if(children.get(i).contains(data)) return true;
            }
        }
        return false;
    }
}
