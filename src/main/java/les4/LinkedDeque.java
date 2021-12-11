package les4;

public class LinkedDeque <E> implements Deque<E>{

    private final TwoSideLinkedList<E> data;
    protected LinkedList.Node<E> first;
    protected LinkedList.Node<E> last;

    public LinkedDeque() {
        this.data = new TwoSideLinkedListImpl<>();
    }




    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeFirst();
    }

    @Override
    public E removeRight() {
        LinkedList.Node<E> prev = null;   // создаем новую переменную
        LinkedList.Node<E> current = first;


        if (isEmpty()) {
            return null;
        }






        return null;
    }

    @Override
    public E peekLeft() {
        return data.getLast();
    }

    @Override
    public E peekRight() {
        return data.getFirst();
    }

    @Override
    public void addFirst(E value) {

    }

    @Override
    public void addLast(E value) {

    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public String toString() {
        return "LinkedDeque{" +
                "data=" + data +
                '}';
    }
}
