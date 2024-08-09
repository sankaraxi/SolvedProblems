package easyProblems.insertion;

public class InsertHead {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);
        head = insertHead(head,10);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node insertHead(Node head, int val){
        Node temp = new Node (val, head);
        return temp;
    }

    static Node convertArrayToLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
