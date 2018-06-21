package javaexam.generic.exam07;

import javaexam.generic.exam02.Box;

public class GenericUpperBoundedWildcardsTest {
    public static <T extends Comparable> int compare1(Box<T> box1, Box<T> box2){
        return box1.get().compareTo(box2.get());
    }

    public static int compare2(Box<? extends Comparable> box1, Box<? extends Comparable> box2){
        return box1.get().compareTo(box2.get());
    }


    public static void main(String[] args){
        Box<Integer> box1 = new Box<>();
        box1.set(20);

        Box<Integer> box2 = new Box<>();
        box2.set(10);

        System.out.println(GenericUpperBoundedWildcardsTest.compare1(box1, box2));
        System.out.println(GenericUpperBoundedWildcardsTest.compare2(box1, box2));
    }
}
