public class q2 {
    public int size() {
        int count = 0;
        Node<E> current = header.getNext();

        while (current != trailer) {
            count++;
            current = current.getNext();
        }

    return count;
    }
}
