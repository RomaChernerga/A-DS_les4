package les4;

public interface Stack<E> {

    void push(E value); //добавление элемента

    E pop();  //извлечение элемента

    E peek(); // top()  показывает последний элемент

    int size(); //возвращает размер стека

    boolean isEmpty(); //проверка, пустой ли стек

    boolean isFull();  //проверка, полон ли стек

    void display();     //показ на экране состав стека

}
