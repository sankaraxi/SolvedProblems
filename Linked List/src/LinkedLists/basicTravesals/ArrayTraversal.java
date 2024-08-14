package LinkedLists.basicTravesals;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);
        System.out.println(head.data);
    }

     private static Node convertArrayToLinkedList(int[] arr){
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

