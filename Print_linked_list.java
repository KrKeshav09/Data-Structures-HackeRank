import java.util.Scanner;

class Print_linkedlist {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Print_linkedlist insert(Print_linkedlist list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(Print_linkedlist list) {
        Node currNode = list.head;
        while(currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Print_linkedlist list = new Print_linkedlist();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            list = insert(list, sc.nextInt());
            n--;
        }
        printList(list); 
        sc.close();
    }
}