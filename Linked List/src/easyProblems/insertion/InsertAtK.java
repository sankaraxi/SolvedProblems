package easyProblems.insertion;

public class InsertAtK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedList(arr);
        head = insertAtK(head,10, 4);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    static Node insertAtK(Node head, int val, int k){
        if (head == null){
            if (k == 1){
                return new Node(val);
            }else return null;
        }

        if (k == 1){
            Node temp = new Node(val, head);
            return temp;
        }

        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            if (count == k-1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
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
