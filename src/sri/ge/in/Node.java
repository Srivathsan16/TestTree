package sri.ge.in;

public class Node {

    int data;



    Node right;
    Node left;

    public Node(){

    }

    public Node(int data, Node right, Node left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    public static Node newNode(int data) {
        Node n = new Node();
        n.left = null;
        n.right = null;
        n.data = data;
        return  n;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }


}
