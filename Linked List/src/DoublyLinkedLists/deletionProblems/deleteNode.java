package DoublyLinkedLists.deletionProblems;

public class deleteNode {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createDoublyLinkedList(arr);

        deleteNode(head.next);

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
    }

    static void deleteNode(Node node){
        Node tempPrev = node.prev;
        Node tempNext = node.next;

        if(tempNext == null) {
            tempPrev.next = null;
            node.prev = null;
            return;

        }
        tempPrev.next = tempNext;
        tempNext.prev = tempPrev;

        node.next = null;
        node.prev = null;


    }

    static Node createDoublyLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = prev.next;
        }
        return  head;
    }

}
