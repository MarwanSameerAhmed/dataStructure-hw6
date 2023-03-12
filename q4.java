public class q4 {
    public static <E> DoublyLinkedList<E> concatenate(DoublyLinkedList<E> L, DoublyLinkedList<E> M) {
        if (L.isEmpty()) {
            return M;
        }
        if (M.isEmpty()) {
            return L;
        }

        DoublyLinkedList<E> Lprime = new DoublyLinkedList<>();
        Node<E> headerLprime = Lprime.getHeader();
        Node<E> trailerLprime = Lprime.getTrailer();

        Node<E> firstNodeL = L.getHeader().getNext();
        Node<E> lastNodeL = L.getTrailer().getPrevious();
        Node<E> firstNodeM = M.getHeader().getNext();
        Node<E> lastNodeM = M.getTrailer().getPrevious();

        headerLprime.setNext(firstNodeL);
        firstNodeL.setPrevious(headerLprime);
        lastNodeL.setNext(firstNodeM);
        firstNodeM.setPrevious(lastNodeL);
        lastNodeM.setNext(trailerLprime);
        trailerLprime.setPrevious(lastNodeM);

        return Lprime;
    }public static <E> DoublyLinkedList<E> concatenate(DoublyLinkedList<E> L, DoublyLinkedList<E> M) {
        if (L.isEmpty()) {
            return M;
        }
        if (M.isEmpty()) {
            return L;
        }

        DoublyLinkedList<E> Lprime = new DoublyLinkedList<>();
        Node<E> headerLprime = Lprime.getHeader();
        Node<E> trailerLprime = Lprime.getTrailer();

        Node<E> firstNodeL = L.getHeader().getNext();
        Node<E> lastNodeL = L.getTrailer().getPrevious();
        Node<E> firstNodeM = M.getHeader().getNext();
        Node<E> lastNodeM = M.getTrailer().getPrevious();

        headerLprime.setNext(firstNodeL);
        firstNodeL.setPrevious(headerLprime);
        lastNodeL.setNext(firstNodeM);
        firstNodeM.setPrevious(lastNodeL);
        lastNodeM.setNext(trailerLprime);
        trailerLprime.setPrevious(lastNodeM);

        return Lprime;
    }
}
