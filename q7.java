public class q7 {
    public class CircularDoublyLinkedList<E> {
        private int size;
        private Node<E> current;

        // Node class
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

            public void setPrev(Node<E> p) {
                prev = p;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> n) {
                next = n;
            }
        }

        // Constructor
        public CircularDoublyLinkedList() {
            size = 0;
            current = null;
        }

        // Access methods
        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public E current() {
            if (isEmpty()) {
                return null;
            }
            return current.getElement();
        }

        // Update methods
        public void addFirst(E e) {
            if (isEmpty()) {
                current = new Node<>(e, null, null);
                current.setPrev(current);
                current.setNext(current);
            } else {
                Node<E> newNode = new Node<>(e, current.getPrev(), current);
                current.getPrev().setNext(newNode);
                current.setPrev(newNode);
            }
            size++;
        }

        public void addLast(E e) {
            addFirst(e);
            current = current.getNext();
        }

        public E removeFirst() {
            if (isEmpty()) {
                return null;
            }
            E removedElement = current.getElement();
            if (size == 1) {
                current = null;
            } else {
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
                current = current.getNext();
            }
            size--;
            return removedElement;
        }

        public E removeLast() {
            if (isEmpty()) {
                return null;
            }
            current = current.getPrev();
            E removedElement = removeFirst();
            current = current.getNext();
            return removedElement;
        }

        public void rotate() {
            if (!isEmpty()) {
                current = current.getNext();
            }
        }

        public void rotateBackward() {
            if (!isEmpty()) {
                current = current.getPrev();
        }
    }
    }
}
