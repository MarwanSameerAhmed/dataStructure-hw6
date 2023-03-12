public class q1 {
    public static <E> void splitInHalf(CircularlyLinkedList<E> L, CircularlyLinkedList<E> A, CircularlyLinkedList<E> B) {
        Node<E> tailL = L.tail;
        Node<E> mid = L.head;
        for (int i = 0; i < L.size() / 2 - 1; i++) {
            mid = mid.getNext();
        }
        Node<E> next = mid.getNext();
        mid.setNext(tailL.getNext());
        tailL.setNext(next);
        A.head = L.head;
        A.tail = mid;
        B.head = next;
        B.tail = tailL;
    }
}
