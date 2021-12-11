package les4;

public interface Deque<E>  {

    boolean insertLeft(E value);    // для добавления элемента слева;
    boolean insertRight(E value);   // для добавления элемента справа;

    E removeLeft();     // для удаления первого элемента;
    E removeRight();    // для удаления последнего элемента;

    E peekLeft(); // показывает крайний элемент слева
    E peekRight(); // показывает крайний элемент справа

    void addFirst(E value); //добавление элемента в голову
    void addLast(E value); //добавление элемента в хвост

    int size(); //возвращает размер стека

    boolean isEmpty(); //проверка, пустой ли стек

    boolean isFull();  //проверка, полон ли стек

    void display();     //показ на экране состав стека





}
