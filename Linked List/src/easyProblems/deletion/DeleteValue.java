package easyProblems.deletion;


public class DeleteValue {
    public static void main(String[] args) {
//        int[] arr = {16,19,20,21,27,87,4664};
        int[] arr = {7,7,7,7};
        Node head = convertArrayToLinkedList(arr);
        head = deleteValue(head , 7);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node deleteValue(Node head, int value){
        if (head == null) return null;

        if (head.data == value){ // if the value is at the head
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null; // to keep track of the previous node
        while(temp != null){
            if (temp.data == value){ // if the value is found
                prev.next = prev.next.next; // skip the current node
                break;
            }

            prev = temp;
            temp = temp.next;
        }
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
