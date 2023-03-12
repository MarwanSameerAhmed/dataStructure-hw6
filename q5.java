public class q5 {
    public class DoublyLinkedList<E> {
        private Node<E> sentinel;
        private int size;

        private static class Node<E> {
            private E element;
            private Node<E> prev;
            private Node<E> next;

            public Node(E e, Node<E> p, Node<E> n) {
                element = e;
                prev = p;
                next = n;
            }

            public E getElement() {
                return element;
            }

            public Node<E> getPrev() {
                return prev;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setPrev(Node<E> p) {
                prev = p;
            }

            public void setNext(Node<E> n) {
                next = n;
            }
        }

        public DoublyLinkedList() {
            sentinel = new Node<>(null, null, null);
            sentinel.setPrev(sentinel);
            sentinel.setNext(sentinel);
            size = 0;
        }

        public int size() {
            int count = 0;
            Node<E> current = sentinel.getNext();
            while (current != sentinel) {
                count++;
                current = current.getNext();
            }
            return count;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public E first() {
            if (isEmpty()) {
                return null;
            }
            return sentinel.getNext().getElement();
        }

        public E last() {
            if (isEmpty()) {
                return null;
            }
            return sentinel.getPrev().getElement();
        }

        public void addFirst(E e) {
            addBetween(e, sentinel, sentinel.getNext());
        }

        public void addLast(E e) {
            addBetween(e, sentinel.getPrev(), sentinel);
        }

        public E removeFirst() {
            if (isEmpty()) {
                return null;
            }
            return remove(sentinel.getNext());
        }

        public E removeLast() {
            if (isEmpty()) {
                return null;
            }
            return remove(sentinel.getPrev());
        }

        private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
            Node<E> newNode = new Node<>(e, predecessor, successor);
            predecessor.setNext(newNode);
            successor.setPrev(newNode);
            size++;
        }

        private E remove(Node<E> node) {
            Node<E> predecessor = node.getPrev();
            Node<E> successor = node.getNext();
            predecessor.setNext(successor);
            successor.setPrev(predecessor);
            size--;
            return node.getElement();
    }
    }
}
