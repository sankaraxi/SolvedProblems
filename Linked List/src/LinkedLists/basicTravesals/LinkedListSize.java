package LinkedLists.basicTravesals;



public class LinkedListSize {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);

        Node temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        System.out.println(size);
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
