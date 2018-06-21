package javaexam.generic.exam10;

import javaexam.generic.exam02.Box;

public class Container<T> extends Box<T> {
    private Box<T>[] array;

    public Container(int size){
        array = new Box[size];
    }

    public void set(int index, Box<T> box){
        array[index] = box;
    }

    public Box<T> get(int index){
        return array[index];
    }
}
