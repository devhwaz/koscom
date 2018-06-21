package javaexam.generic.exam03;

import javaexam.generic.exam02.Box;

public class BoxRawTest {
    public static void main(String[] args){
        Box box = new Box<>();
        box.set("hello");

        Box<Integer> box2 = box;
        Integer intObj2 = box2.get();
        System.out.println(intObj2.intValue());
    }
}
/// Incompatiable type