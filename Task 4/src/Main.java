public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(15);
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(35);
        list.addLast(22);
        list.printElements();
        System.out.println("max is:"+list.max());
        System.out.println("min is:"+list.min());
        System.out.println("index is:"+list.indexOf(5));
    }
}
