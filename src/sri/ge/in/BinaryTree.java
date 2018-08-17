package sri.ge.in;

import java.util.*;
public class BinaryTree {
    List<Integer> li = new LinkedList<>();
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

//This List can be pused to Database using @ElementCollection or something
    void constructListFromtree(Node root)
    {
        if (root == null)
            return;


        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        while (curr != null || s.size() > 0)
        {

           while (curr !=  null)
            {
               s.push(curr);
               if(!li.contains(curr.data))
                li.add(curr.data);
                curr = curr.left;
            }

           curr = s.pop();
            if(!li.contains(curr.data))
            li.add(curr.data);
            curr = curr.right;
        }
        System.out.printf(":List::" +li);
    }

}
