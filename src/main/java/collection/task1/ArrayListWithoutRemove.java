package collection;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayListWithoutRemove<E> extends AbstractList {
private  E[] values;

    ArrayListWithoutRemove() {
        values = (E[]) new Object[0];
    }

    public boolean add(Object e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = (E) e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public Iterator iterator() {
        return super.iterator();
    }

    @Override
    public int size() {
        return values.length;
    }


    public void update(int index, E e) {
        values[index] = e;

    }

//    @Override
//    public Iterator<E> iterator() {
//        return new ArrayIterator<>(values);
//    }



}
