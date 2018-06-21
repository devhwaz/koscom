package javaexam.generic.exam08;

import javaexam.generic.exam02.Box;

public class LowerBoundedWildcardsTest {
    public static void print(Box<? super Bus> box){
        System.out.println(box.get());
    }


    public static void main(String[] args){
        Box<Car> carBox = new Box<>();
        carBox.set(new Car());

        Box<Bus> busBox = new Box<>();
        busBox.set(new Bus());

        Box<DoubleDeckBus> doubleDeckBusBox = new Box<>();
        doubleDeckBusBox.set(new DoubleDeckBus());

        LowerBoundedWildcardsTest.print(carBox);
        LowerBoundedWildcardsTest.print(busBox);
//        LowerBoundedWildcardsTest.print(doubleDeckBusBox);
    }
}

class Car{
    public String toString(){
        return "자동차";
    }
}

class Bus extends Car {
    public String toString(){
        return "버스";
    }
}

class DoubleDeckBus extends Bus {
    public String toString(){
        return "이층버스";
    }
}