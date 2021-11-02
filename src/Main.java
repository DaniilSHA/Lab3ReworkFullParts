public class Main {
    public static void main(String[] args) {
        System.out.println("демонстрация работы односвязного списка".toUpperCase());
        LinkedList list = new LinkedList();

        System.out.println("Добавление элементов в начало списка");
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(5);
        list.addFirst(-3);
        list.addFirst(4);
        list.addFirst(-1000);
        list.addFirst(78);
        System.out.println(list.print());

        System.out.println("Добавление элементов в конец списка");
        list.addLast(8);
        list.addLast(878);
        list.addLast(94);
        list.addLast(3);
        System.out.println(list.print());

        System.out.println("Получение значения первого элемента " + list.getFirst());
        System.out.println("Получение значения последнего элемента " + list.getLast());

        System.out.println("Получение значения и удаление первого элемента " + list.getRemoveFromStart());
        System.out.println(list.print());

        System.out.println("Получение значения и удаление последнего элемента " + list.getRemoveFromEnd());
        System.out.println(list.print());

        System.out.println("Поиск значения " + list.contains(888));
        System.out.println(list.print());

        System.out.println("Поиск значения " + list.contains(8));
        System.out.println(list.print());

        System.out.println("Длина списка " + list.size());
        System.out.println(list.print());

        System.out.println("Удаление первого элемента");
        list.removeFirst();
        System.out.println(list.print());

        System.out.println("Удаление последнего элемента");
        list.removeLast();
        System.out.println(list.print());

        System.out.println("демонстрация работы двухсвязного списка".toUpperCase());
        DoublyLinkedList doublyList = new DoublyLinkedList();

        int [] data1 = {6, 3, 2};
        int [] data2 = {8, 37, 288};
        int [] data3 = {77, 66, 55};

        System.out.println("Добавление массива данных в начало списка");
        doublyList.addArrayFirst(data1);
        doublyList.addArrayFirst(data2);

        System.out.println("Распечатование с начала");
        System.out.println(doublyList.printFromStart());

        System.out.println("Распечатование с конца");
        System.out.println(doublyList.printFromEnd());

        System.out.println("Добавление массива данных в конец списка");
        doublyList.addArrayLast(data3);
        System.out.println(doublyList.printFromStart());
        System.out.println(doublyList.printFromEnd());

        System.out.println("Добавление массива данных в дополнительный список #1 ");
        DoublyLinkedList doublyListToAdd1 = new DoublyLinkedList();
        int [] data4 = {1000, 1000, 1000};

        System.out.println("Добавление дополнительного списока #1 в начало основного");
        doublyListToAdd1.addArrayFirst(data4);
        System.out.println(doublyListToAdd1.printFromStart());
        doublyList.addListFirst(doublyListToAdd1);
        System.out.println(doublyList.printFromStart());
        System.out.println(doublyList.printFromEnd());

        System.out.println("Добавление массива данных в дополнительный список #2 ");
        int [] data5 = {5000, 5000, 5000};
        DoublyLinkedList doublyListToAdd2 = new DoublyLinkedList();
        doublyListToAdd2.addArrayFirst(data5);
        System.out.println(doublyListToAdd2.printFromStart());

        System.out.println("Добавление дополнительного списока #2 в конец основного");
        doublyList.addListLast(doublyListToAdd2);
        System.out.println(doublyList.printFromStart());
        System.out.println(doublyList.printFromEnd());

    }
}
