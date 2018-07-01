package javaexam.designpattern.exam02.abstract_factory.tablefactory;
import javaexam.designpattern.exam02.abstract_factory.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
