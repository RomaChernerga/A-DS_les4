package les4;

public interface TwoSideLinkedList<E> extends LinkedList<E> {

    void insertLast(E value); //для добавления в самый конец списка

    E getLast();

}
