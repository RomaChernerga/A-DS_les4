package les4;

public class TestMain {

    public static void main(String[] args) {
        testLinkedList();
    }



    private static void testLinkedList() {

//        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8); // добавляем его в самый конец, но отображаться он будет первым
        linkedList.insertLast(9); // добавляем в самый конец списка, но находиться он будет в начале
        linkedList.insertLast(10);
        linkedList.insertLast(11);

        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));

        linkedList.removeFirst(); // удалили первый элемент из списка
        linkedList.remove(4); // удалили элемент 4 (не под номером 4)

        linkedList.display();


    }


}


