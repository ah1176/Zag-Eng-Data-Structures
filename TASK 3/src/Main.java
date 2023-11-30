public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(5);
        array.insert(3);
        array.insert(4);
        array.insert(1);
        array.insert(16);
        array.insert(32);
        array.insert(64);
        array.insert(55);
        array.printArray();
        System.out.println("max num is:" + array.max());
        System.out.println("min num is:" + array.min());
        System.out.println(array.at(2));
        array.removeAt(0);
        array.printArray();


    }
}