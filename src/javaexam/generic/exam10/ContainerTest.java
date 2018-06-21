package javaexam.generic.exam10;

import javaexam.generic.exam02.Box;
import javaexam.generic.exam10.Container;

public class ContainerTest {
    public static void main(String[] args){
        Container<String> container = new Container<>(5);
        Box<String> box1 = new Box<>();
        box1.set("hello");

        Box<String> box2 = new Box<>();
        box2.set("world");

        container.set(0, box1);
        container.set(1, box2);

        System.out.println(container.get(0).get());
        System.out.println(container.get(1).get());
    }
}
