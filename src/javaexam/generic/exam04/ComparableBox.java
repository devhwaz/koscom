package javaexam.generic.exam04;

public class ComparableBox<T extends Comparable>{
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
    public int compare(T t){
        return this.t.compareTo(t);
    }
}
