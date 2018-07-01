package javaexam.designpattern.exam02.factory_method.idcard;
import java.util.*;

import javaexam.designpattern.exam02.factory_method.framework.*;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public List<String> getOwners() {
        return owners;
    }
}
