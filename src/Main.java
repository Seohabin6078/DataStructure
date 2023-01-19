import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyTree<String> habinTree = new MyTree<>("habin");
        habinTree.addChildNode(new MyTree<>("age"));
        habinTree.addChildNode(new MyTree<>("gender"));
        habinTree.addChildNode(new MyTree<>("major"));

        System.out.println(habinTree.contains("age"));
        System.out.println(habinTree.contains("good"));

    }
}