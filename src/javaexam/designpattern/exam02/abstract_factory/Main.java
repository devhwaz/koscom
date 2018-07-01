package javaexam.designpattern.exam02.abstract_factory;
import javaexam.designpattern.exam02.abstract_factory.factory.Factory;
import javaexam.designpattern.exam02.abstract_factory.factory.Link;
import javaexam.designpattern.exam02.abstract_factory.factory.Page;
import javaexam.designpattern.exam02.abstract_factory.factory.Tray;
import javaexam.designpattern.exam02.abstract_factory.tablefactory.TableFactory;

public class Main {
    public static void main(String[] args) {
// factory를 외부의 파라미터를 통해서 바꿔주는 코드
//        if (args.length != 1) {
//            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
//            System.out.println("Example 1: java Main exam2.listfactory.ListFactory");
//            System.out.println("Example 2: java Main exam2.tablefactory.TableFactory");
//            System.exit(0);
//        }
//        Factory factory = Factory.getFactory(args[0]);
        Factory factory = new TableFactory();

        Link joins = factory.createLink("중앙일보", "http://www.joins.com");
        Link hani = factory.createLink("한계레 신문", "http://www.hani.co.kr/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link kr_yahoo = factory.createLink("Yahoo!korea", "http://www.yahoo.co.kr/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(hani);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(kr_yahoo);

        Tray traysearch = factory.createTray("서치엔진");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "홍길동");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
