package home_work_4.dto;

import home_work_4.api.IComparator;

import java.util.Arrays;


public class DataContainer<T> {
    private T[] data;
    private int i = 0;
    private int index;
    private IComparator comparator;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {

        if (item == null) {
            return -1;
        } else {
            while (i <= data.length - 1 && data[i] != null) {
                i++;
            }
        }
        if (i <= data.length - 1) {
            data[i] = item;
        } else {
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = item;
            i = data.length - 1;
        }
        return i;
    }

    public T get(int i) {
        if (i > data.length - 1) {
            return null;
        } else {
            return data[i];
        }
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {

        if (index > data.length - 1) {
            return false;
        } else {
            if (index == 0) {
                data = Arrays.copyOfRange(data, 1, data.length - 1);
                return true;
            }
            if (index == data.length - 1) {
                data = Arrays.copyOfRange(data, 0, data.length - 1);
                return true;
            } else {
                T[] dataFirst = Arrays.copyOfRange(data, 0, index);
                T[] dataSecond = Arrays.copyOfRange(data, index + 1, data.length);
                data = Arrays.copyOf(data, data.length - 1);
                System.arraycopy(dataFirst, 0, data, 0, data.length + 1 - index);
                System.arraycopy(dataSecond, 0, data, index, dataSecond.length);
                return true;
            }
        }
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        } else {
            for (int j = 0; j < data.length; j++) {
                if (data[j].equals(item)) {
                    index = j;
                    break;
                }
            }
            if (index == 0 && !data[0].equals(item)) {
                return false;
            }
            if (index == 0 && data[0].equals(item)) {
                data = Arrays.copyOfRange(data, 1, data.length - 1);
                return true;
            }
            if (index == data.length - 1) {
                data = Arrays.copyOfRange(data, 0, data.length - 1);
                return true;
            } else {
                T[] dataFirst = Arrays.copyOfRange(data, 0, index);
                T[] dataSecond = Arrays.copyOfRange(data, index + 1, data.length);
                data = Arrays.copyOf(data, data.length - 1);
                System.arraycopy(dataFirst, 0, data, 0, dataFirst.length);
                System.arraycopy(dataSecond, 0, data, index, dataSecond.length);
                return true;
            }
        }
    }

    /* public void sort (IComparator <T> comparator) {
         this.comparator = comparator;

     }*/
    @Override
    public String toString() {
        String array = "[";
        for ( int i = 0; i < data.length; i++ ) {
            if (data[i] != null) {
            array += data[i];
            array += " ";
        }
        }
        array += "]";
            return array;
        }
    }

