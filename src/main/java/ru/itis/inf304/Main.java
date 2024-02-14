package ru.itis.inf304;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
        List304ImplAsArray array1 = new List304ImplAsArray(0);

     /*   array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        array1.toString();
        System.out.println(array1.size());
        array1.delete(2);
        System.out.println(array1.pop());*/

        List304ImplAsLinkedList list1 = new List304ImplAsLinkedList(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1.listToString());
        System.out.println(list1.get(2));
        System.out.println(list1.size);
        list1.delete(1);
        list1.delete(2);
        System.out.println(list1.listToString());
        System.out.println(list1.size);
        list1.pop();
        System.out.println(list1.listToString());
        System.out.println(list1.size);
    }
}

