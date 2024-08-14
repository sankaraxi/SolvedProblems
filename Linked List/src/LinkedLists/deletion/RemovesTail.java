package LinkedLists.deletion;


public class RemovesTail {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);
        head = removeTail(head);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node removeTail(Node head){
        if (head == null || head.next == null) return null;
        Node temp = head;

        while (temp.next.next != null){
            temp = temp.next; // moving to the second last node
        }
        temp.next = null; // removing the tail
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
