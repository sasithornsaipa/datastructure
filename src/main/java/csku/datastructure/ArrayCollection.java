package csku.datastructure;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollection implements Collection {
    private Object[] elementData;
    private int size;

    public ArrayCollection(int c) {
        elementData = new Object[c];
        size = c;
    }

    public void add(Object e) {
        if(e == null) throw new IllegalArgumentException();
        elementData[size++] = e;
    }
    private int indexOf(Object e) {
        for (int i=0; i<size; i++)
            if (elementData[i].equals(e)) return i;
        return -1;
    }
    public void remove(Object e) {
        int i = indexOf(e);
        if (i != -1) {
            elementData[i] = elementData[--size];
            elementData[size] = null;
        }
    }
    public boolean isEmpty() {
        return false;
    }
    public boolean contains(Object e) {
        return indexOf(e) != -1;
    }
    public int size() {
        return size;
    }
}
