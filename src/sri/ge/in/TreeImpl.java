package sri.ge.in;

import java.util.List;
import java.util.Scanner;

public class TreeImpl {
    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();
        Node head = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Binary Tree \n");

        char ch;
        do {

            System.out.println("\nBinary Tree Operations\n");

            System.out.println("1. insert ");

            System.out.println("2. search");

            int choice = scan.nextInt();
            switch (choice)

            {

                case 1:
                    System.out.printf("Enter the Number of elements:");
                    int count = scan.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.println("Enter integer element to insert");
                        head = bt.addNode(scan.nextInt(), head);
                    }
                    bt.constructListFromtree(head);

                    break;

                case 2:

                    System.out.println("Enter integer element to search");

                    boolean flag = bt.search(head, scan.nextInt());
                    if(flag)
                    System.out.printf("Value Present:::" + flag);
                    else
                        System.out.printf("Value not there:::" + flag);
                    break;

                default:
                    System.out.printf("Please Enter Correct Choice");

            } System.out.println("\n\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');
    }
}
