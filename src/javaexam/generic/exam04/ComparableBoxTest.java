package javaexam.generic.exam04;

public class ComparableBoxTest {
    public static <T extends Comparable> int compare(T value1, T value2){
        return value1.compareTo(value2);
    }

    public static void main(String[] args){
        Integer v1 = new Integer(5);

        Integer v2 = new Integer(10);

        System.out.println(compare(v1, v2));
    }
}