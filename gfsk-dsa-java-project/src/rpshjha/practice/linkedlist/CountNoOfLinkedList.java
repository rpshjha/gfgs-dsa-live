package rpshjha.practice.linkedlist;

public class CountNoOfLinkedList {

    public static int getCount(Node head) {

        //Code here
        return head == null ? 0 : 1 + getCount(head.next);
    }
}
