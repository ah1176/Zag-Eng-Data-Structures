public class DynamicArray {
    int[] elements;
    int size = 0;
    int count = 0;

    public DynamicArray(int n) {
        size = n;
        elements = new int[n];
    }

    public DynamicArray() {
        size = 100;
        elements = new int[100];
    }

    public void insert(int item) {
        if (size == count) {
            size *= 2;
            int[] newElements = new int[size];
            copyArray(elements, newElements);
            elements = newElements;
        }
        elements[count] = item;
        count++;
    }

    private void copyArray(int[] elements, int[] newElements) {
        for (int i = 0; i < count; i++)
            newElements[i] = elements[i];
    }

    public void removeAt(int index) {
        if (index < 0 || index > count)
            throw new IllegalStateException("non valid index");
        for (int i = 0; i < count - 1; i++)
            elements[i] = elements[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (item == elements[i])
                return i;
        return -1;
    }

    public int at(int index) {
        if (index < 0 || index > count)
            throw new IllegalStateException("non valid index");
        for (int i = 0; i < count; i++)
            if (index == i)
                return elements[i];
        return 0;
    }

    public int max() {
        int largest = elements[0];
        for (int i = 1; i < count; i++)
            if (largest < elements[i])
                largest = elements[i];
        return largest;
    }

    public int min() {
        int smallest = elements[0];
        for (int i = 1; i < count; i++)
            if (smallest > elements[i])
                smallest = elements[i];
        return smallest;
    }

    public void remove(int item) {
        int index = indexOf(item);
        if (index != -1)
            removeAt(index);
    }

    public void printArray() {
        for (int i = 0; i < count; i++)
            System.out.print(elements[i] + "  ");
        System.out.println();
    }
}
