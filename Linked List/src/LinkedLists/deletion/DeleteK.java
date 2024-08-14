package LinkedLists.deletion;


public class DeleteK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);
        head = deleteK(head , 4);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node deleteK(Node head, int K){
        if (head == null) return null;

        if (K == 1){
            head = head.next;
            return head;
        }

        int count = 0;
        Node temp = head;
        Node prev = null; // to keep track of the previous node
        while(temp != null){
            count = count + 1;

            if (count == K){
                prev.next = prev.next.next;
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
