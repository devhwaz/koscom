package javaexam.generic.exam02;

public class BoxTest {
    public static void main(String[] args){
        Box<Integer> box = new Box<>();
        box.set(new Integer(5));
        Integer intObj = box.get();
        System.out.println(intObj.intValue());
    }
}
