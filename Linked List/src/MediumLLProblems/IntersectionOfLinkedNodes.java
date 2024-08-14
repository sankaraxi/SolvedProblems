package MediumLLProblems;
//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfLinkedNodes {
    public static void main(String[] args) {

    }

    public Node getIntersectionNode(Node headA, Node headB) {

        if (headA == null || headB == null) { // if any one of the node is null
            return null;
        }

        Node temp1 = headA;
        Node temp2 = headB;

        while(temp1 != temp2){

            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2) return temp1;

            if (temp1 == null) temp1 = headB;
            if (temp2 == null) temp2 = headA;

        }

        return temp1;

    }
}
