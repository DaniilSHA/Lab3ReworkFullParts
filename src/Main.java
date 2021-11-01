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

    }
}
