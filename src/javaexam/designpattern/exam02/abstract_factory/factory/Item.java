package javaexam.designpattern.exam02.abstract_factory.factory;

public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
