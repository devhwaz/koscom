package javaexam.designpattern.exam02.factory_method.book;

import javaexam.designpattern.exam02.factory_method.framework.Factory;
import javaexam.designpattern.exam02.factory_method.framework.Product;

public class BookFactory extends Factory {

	protected Product createProduct(String owner) {
		return new Book();
	}

	protected void registerProduct(Product product) {


	}

}
