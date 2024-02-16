package ru.itis.inf304;

public class List304ImplAsLinkedList implements List304 {
    public int size;
    public int index = 1;
    public List304ImplAsLinkedList (int size) {this.size = size;}
    Element head;
    Element tail;
    @Override
    public void add(Integer e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        Element current = new Element(e,index);
        index++;
        size++;
        if (tail == null) {
            head = current;
            tail = current;
        } else {
            tail.next = current;
            tail = current;
        }
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= size && index < 0) throw new IndexOutOfBoundsException();
        Element current = head;
        Integer result = 0;
        while (current!= null){
            if (current.index == index){
                result = current.value;
            }
            current = current.next;
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size && index < 0) throw new IndexOutOfBoundsException();
        Element current = head;
        Element prev = null;
        boolean flag = true;
        while (flag) {
            if (current.index == index - 1) {
                prev = current;
            }
            if (current.index == index) {
                if (prev == null) {
                    head = current.next;
                    current.next = null;
                    size--;
                    flag = false;
                    reindex();
                } else {
                    prev.next = current.next;
                    current.next = null;
                    size--;
                    flag = false;
                    reindex();
                }
                current = head;
            }
            current = current.next;
        }
    }
    private void reindex(){
        Element current = head;
        int i = 1;
        while (current != null){
            current.index = i;
            i++;
            current = current.next;
        }
    }
    @Override
    public Integer pop() {
        Element current = head;
        boolean flag = true;
        Integer result = 0;
        while (flag){
            if (current.next == null){
                result = current.value;
                delete(current.index);
                flag = false;
            }
            current = current.next;
        }
        return result;
    }
    public String listToString() {
        String string = "";
        Element current = head;

        while (current != null) {
                string += current.value + " ";
                current = current.next;
        }
        return string;
    }
}
