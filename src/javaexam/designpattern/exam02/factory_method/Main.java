package javaexam.designpattern.exam02.factory_method;
import javaexam.designpattern.exam02.factory_method.framework.*;
import javaexam.designpattern.exam02.factory_method.idcard.*;

public class Main {
	//인스턴스를 만드는 방법은 
	//상위 클래스에서 결정하지만, 구체적인 내용은 하위 클래스에서 구현한다.
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("홍길동");
        Product product2 = factory.create("이순신");
        Product product3 = factory.create("강감찬");
        product1.use();
        product2.use();
        product3.use();
    }
}
