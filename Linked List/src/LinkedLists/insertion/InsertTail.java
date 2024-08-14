package LinkedLists.insertion;

public class InsertTail {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);
        head = insertTail(head,10);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node insertTail(Node head, int val){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next; // this will take the temp to the last node
        }
        Node newNode = new Node(val); // create a new node
        temp.next = newNode; // add the new node to the last node
        return head;
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
