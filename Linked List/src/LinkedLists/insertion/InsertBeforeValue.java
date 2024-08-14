package LinkedLists.insertion;

public class InsertBeforeValue {
    public static void main(String[] args) {
        int[] arr = {15,45,20,22,33,43,54};
        Node head = convertArrayToLinkedList(arr);
        head = insertBeforeValue(head,21, 22);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node insertBeforeValue(Node head, int insertVal, int value){
        if (head == null) return null; // if the linked list is empty , inserting before value is technically not possible

        if (head.data == value){
            Node temp = new Node(insertVal, head);
            return temp;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (temp.data == value){
                Node newNode = new Node(insertVal);
                newNode.next = temp;
                prev.next = newNode;
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
