package javaexam.generic.exam01;

public class ObjectBoxTest {
    public static void main(String[] args){
        ObjectBox objBox = new ObjectBox();
        objBox.set(new Integer(5));
        String str = (String)objBox.get();
        System.out.println(str);
    }
}
