public class q3 {
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof DoublyLinkedList)) {
            return false;
        }

        DoublyLinkedList<E> otherList = (DoublyLinkedList<E>) o;

        if (this.size() != otherList.size()) {
            return false;
        }

        Node<E> currentNode1 = this.header.getNext();
        Node<E> currentNode2 = otherList.header.getNext();

        while (currentNode1 != this.trailer) {
            if (!currentNode1.getElement().equals(currentNode2.getElement())) {
                return false;
            }
            currentNode1 = currentNode1.getNext();
            currentNode2 = currentNode2.getNext();
        }

    return true;
    }
}
