package javaexam.designpattern.exam02.abstract_factory.listfactory;
import javaexam.designpattern.exam02.abstract_factory.factory.Factory;
import javaexam.designpattern.exam02.abstract_factory.factory.Link;
import javaexam.designpattern.exam02.abstract_factory.factory.Page;
import javaexam.designpattern.exam02.abstract_factory.factory.Tray;


public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
