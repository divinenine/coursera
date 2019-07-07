public class MyLinkedList<E> {
    private ListNode<E> head;
    private int size;

    public MyLinkedList () {
        size = 0;
        head = new ListNode<E>(null);
    }
}