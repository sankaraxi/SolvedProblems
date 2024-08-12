package MediumLLProblems;
//https://leetcode.com/problems/linked-list-cycle/description/
public class LinkedListCycle {
    public static void main(String[] args) {

    }
    public class Solution {
        public boolean hasCycle(Node head) {
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){ //if any one is false
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) return true;
            }

            return false;
        }
    }

}


