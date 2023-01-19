import org.w3c.dom.Node;

import java.util.ArrayList;

public class BST {
    private Node root;

    public BST() {
        root = null;
    }


    // 이 메서드도 역시 꼭 반복해서 구현해보기!!!
    public void add(int data) {
        Node newNode = new Node(data);
        if(root==null) {
            root = newNode;
            return;
        }
        if(root.value==data) return;

        Node currentNode = root;
        Node parentNode = null;

        while(true) {
            parentNode = currentNode;

            if(currentNode.getValue()>data) {
                currentNode = parentNode.getLeft();
                if(currentNode == null) {
                    parentNode.setLeft(newNode);
                    return;
                }
                else if(currentNode.getValue()==data) return;
            }
            else {
                currentNode = parentNode.getRight();
                if(currentNode == null) {
                    parentNode.setRight(newNode);
                    return;
                }
                else if(currentNode.getValue()==data) return;
            }
        }
    }

    public void remove(int data) {
        if(root == null) return;

        if(root.value == data) root = null;

        Node currentNode = root;
        Node parentNode = null;

        while(true) {
            parentNode = currentNode;

            if(currentNode.value>data) {
                currentNode = currentNode.left;
                if(currentNode==null) return;
                else if(currentNode.value==data) {
                    parentNode.setLeft(null);
                    return;
                }
            }
            else {
                currentNode = currentNode.right;
                if(currentNode==null) return;
                else if(currentNode.value==data) {
                    parentNode.setRight(null);
                    return;
                }
            }
        }
    }

    public boolean contains(int data) {
        Node currentNode = root;
        while(currentNode != null) {
            if(currentNode.getValue()==data) return true;

            if(currentNode.getValue()>data) {
                currentNode = currentNode.getLeft();
            }
            else currentNode = currentNode.getRight();
        }
        return false;
    }

    public ArrayList<Integer> preorderTree(Node root, int depth, ArrayList<Integer> list) {    //전위 순회
        if (root != null) {
            list.add(root.getValue());
            preorderTree(root.getLeft(), depth + 1, list);
            preorderTree(root.getRight(), depth + 1, list);
        }
        return list;
    }

    public ArrayList<Integer> inorderTree(Node root, int depth, ArrayList<Integer> list) { //중위 순회
        if (root != null) {
            inorderTree(root.getLeft(), depth + 1, list);
            list.add(root.getValue());
            inorderTree(root.getRight(), depth + 1, list);
        }
        return list;
    }

    public ArrayList<Integer> postorderTree(Node root, int depth, ArrayList<Integer> list) {   //후위 순회
        if (root != null) {
            postorderTree(root.getLeft(), depth + 1, list);
            postorderTree(root.getRight(), depth + 1, list);
            list.add(root.getValue());
        }
        return list;
    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
