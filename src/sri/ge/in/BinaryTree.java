package sri.ge.in;

public class BinaryTree {
    public Node addNode(int data, Node head){
        Node tempHead = head;
        Node n = Node.newNode(data);
        if(head == null){
            head = n;
            return head;
        }
        Node prev = null;
        while(head != null){
            prev = head;
            if(head.data < data){
                head = head.right;
            }else{
                head = head.left;
            }
        }
        if(prev.data < data){
            prev.right = n;
        }else{
            prev.left = n;
        }
        return tempHead;
    }

    public boolean search(Node r, int val)

    {

        if (r.getData() == val)

            return true;

        if (r.getLeft() != null)

            if (search(r.getLeft(), val))

                return true;

        if (r.getRight() != null)

            if (search(r.getRight(), val))

                return true;

        return false;

    }


}
