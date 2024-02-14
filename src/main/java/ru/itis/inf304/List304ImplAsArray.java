package ru.itis.inf304;
// внутренняя структура - массив
public class List304ImplAsArray implements List304{
    int capacity;
    public List304ImplAsArray(int capacity){
        this.capacity = capacity;
    }
    Integer array [] = new Integer[0];
    @Override
    public void add(Integer e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        Integer arraynew [] = new Integer[array.length + 1];
        System.arraycopy(array, 0, arraynew, 0, array.length);
        arraynew [capacity++] = e;
        array = arraynew;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= capacity && index < 0) throw new IndexOutOfBoundsException();
        return array[index];
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= capacity && index < 0) throw new IndexOutOfBoundsException();
        for (int i = index - 1; i < capacity-1; i++){
            array[i] = array[i+1];
        }
        capacity--;
    }

    @Override
    public Integer pop() {
        Integer result = array[capacity];
        capacity--;
        return result;
    }
    public String toString() {
        String string = "";
        for (int i = 0; i < capacity; i++ ){
            string += " " + array[i];
        }
        System.out.println(string);
        return string;
    }
}
