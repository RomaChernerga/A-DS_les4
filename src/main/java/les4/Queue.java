package les4;

public interface Queue<E> {

    boolean insert(E value);

    E remove();  //удалять элемент

    E peekFront(); // показывает ближайший элемент для извлечения

    int size(); //возвращает размер стека

    boolean isEmpty(); //проверка, пустой ли стек

    boolean isFull();  //проверка, полон ли стек

    void display();     //показ на экране состав стека

}
