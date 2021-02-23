package list;



public class Main {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList();
        list.addLast("5");
        list.addLast("10");
        list.addLast("11");
        list.addLast("0");
        System.out.println(list);
        System.out.println(list.first);
        System.out.println(list.last);
        System.out.println(list.size);
        list.addFirst("12");
        System.out.println(list);
        System.out.println(list.getFirst());
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
