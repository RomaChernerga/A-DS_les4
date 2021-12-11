package les4;

import java.util.Iterator;

public class SimpleLinkedListImpl <E> implements LinkedList<E>, Iterable<E> {

    protected Node<E> first;
    protected  int size;

    @Override
    public Iterator<E> iterator() { // должен возвращать экземпляр итератора
        return new LinkedListIterator();
    }

    //------------------  HW4
    private class LinkedListIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
        public void reset() {

        }
    }
    //------------------



    @Override
    public void insertFirst(E value) {
        first = new Node<>(value, first); //создаем нов экземпляр, вводим значение и на что ссылаемся
        size++; // увеличиваем размер списка после добавления элемента
//        Node<E> actualFirst = first; //сперва создаем первый элемент со ссылкой на first
//        Node<E> newFirst = new Node<>(value, actualFirst); // создаем нов узел и он будет новым узлом, закладываем данные и ссылку на первый элемент
//        this.first = newFirst; // поле first обновляет значение на newFirst
    }

    @Override
    public E removeFirst() {
        if(isEmpty()) {
            return null;
        }

        Node<E> removedNode = first; //ссылается на первый элемент SLL
        first = removedNode.next; // переназначаем на новый first
        removedNode.next = null; // и обнуляется ссылка на прошлый первый элемент
        size--; //уменьшаем размер после удаления
        return removedNode.item; // возвращаем результат удаляемого узла
    }

    @Override
    public boolean remove(E value) { //удаление элемента внутри списка
        Node<E> current = first;
        Node<E> prev = null;   // создаем новую переменную

        while (current != null) {
            if( current.item.equals(value)) {  // пытаемся найти позицию удаляемого карента
                break;
            }
            prev = current; //обновляем предыдущий карент делая его текущим
            current = current.next;  // задаем текущему каренту значение следующего
        }
        if(current == null) {
            return false;
        } else if (current == first) {
            removeFirst(); // удаляем первый элемент списка, если карент - первый
            return true;
        }

        prev.next = current.next; // родительский элемент удаляемого будет ссылаться на тот элемент, что стоит после удаляемого

        return true;
    }

    @Override
    public boolean contains(E value) { // проверка на наличие элемента в списке
        Node<E> current = first; // пробегаемся начиная с самого первого
        while (current != null) { // Пока каррент не пустой
            if(current.item.equals(value)) {  //сравниваем карен с value
                return true;
            }
            current = current.next; // переход к следующему элементу в списке
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public E getFirst() {
        return first.item; // обращаемся к первому элементу и выводим его
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = first;
        while (current != null) { // пока current неравно null - сы перебираем все элементы доступные
           sb.append(current.item);
           if(current.next != null){  // смотрим current, пока он не пустой
               sb.append(" -> ");  // добавляем стрелочку
           }
           current = current.next; // для обновления карента, т.е. присваиваем каренту - следующий карент
        }
        return sb.append("]").toString();
    }
}
