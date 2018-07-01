package javaexam.designpattern.exam09.flyweight;
public class Main {
    public static void main(String[] args) {
        String str = "123";
        BigString bs = new BigString(str);
        bs.print();
    }
}
