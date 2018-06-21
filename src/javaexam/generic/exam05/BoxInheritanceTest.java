package javaexam.generic.exam05;

import javaexam.generic.exam02.Box;

public class BoxInheritanceTest {
    public static void main(String[] args){
        Box<Number> numberBox = new Box<>();
        numberBox.set(new Integer(5));
        Integer intObj = (Integer)numberBox.get();
        System.out.println(intObj.intValue());

        numberBox.set(new Double(12.4));
        Double doubleObj = (Double)numberBox.get();
        System.out.println(doubleObj.doubleValue());
    }
}
