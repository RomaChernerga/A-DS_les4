package les4;

public class TwoSideLinkedListImpl <E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E> {

    protected Node<E> last;

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if(size == 1) { // если первый элемент и последний одно и тоже, то размер = 1
            last = first;
        }
    }

    @Override
    public void insertLast(E value) {
        if( isEmpty()) {
            insertFirst(value);
            return;
        }

        Node<E> newNode = new Node<>(value,null);

        last.next = newNode;
//        last = last.next;
        last = newNode;
        size++;

    }

    @Override
    public E removeFirst() {
        E removedValue = super.removeFirst();

        if(isEmpty()) {
            last = null;
        }

        return removedValue;
    }

    @Override
    public boolean remove(E value) { // удаление конкретного элемента в списке
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
        } else if (current == last) {
            last = prev;        // в случае если удаляем последний элемент, то удаляем и ссылку на него
            last.next = null;
        }

        prev.next = current.next; // родительский элемент удаляемого будет ссылаться на тот элемент, что стоит после удаляемого
        current.next = null;
        size--;

        return true;
    }

    @Override
    public E getLast() {
        return last.item;
    }
}
