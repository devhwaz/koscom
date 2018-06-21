package javaexam.generic.exam06;

import javaexam.generic.exam02.Box;

public class GenericWildCards {
    public static <T> String concat1(Box<T> box1, Box<T> box2){
        return box1.get().toString() + " " + box2.get().toString();
    }

    public static String concat2(Box<?> box1, Box<?> box2){
        return box1.get().toString() + " " + box2.get().toString();
    }

    public static <T> void print1(T value){
        System.out.println(value);
    }

//    public static void print1(? value){
//        System.out.println(value);
//    }

    public static void main(String[] args){
        Box<String> box1 = new Box<>();
        box1.set("Hello");

        Box<String> box2 = new Box<>();
        box2.set("World");

        String result1 = GenericWildCards.concat1(box1, box2);

        String result2 = GenericWildCards.concat2(box1, box2);

        System.out.println(result1);

        System.out.println(result2);

        print1("Hello World");
    }
}
