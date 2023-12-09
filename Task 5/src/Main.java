public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("ahmed");
        list.addFirst("read");
        list.addFirst("ebrahim");
        list.addFirst("tahoon");
        list.addFirst("hassan");
        list.addLast("mohamed");
        list.reverse();
        list.printElements();
        System.out.println("index is:"+list.indexOf("ahmed"));
        LinkedList<Integer>items = new LinkedList<>();
        items.addFirst(10);
        items.addFirst(30);
        items.addFirst(40);
        items.addFirst(50);
        items.addFirst(60);
        items.addFirst(80);
        items.reverse();
        items.printElements();

    }
}
