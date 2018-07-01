package javaexam.designpattern.exam21.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;                              // 돈
    List<String> fruits;                          // 과일
    public int getMoney() {                 // 돈을 얻는다.(narrow interface)
        return money;
    }
    Memento(int money) {                    // 생성자(wide interface)
        this.money = money;
        this.fruits = new ArrayList<>();
    }
    void addFruit(String fruit) {           // 과일을 추가한다.(wide interface)
        fruits.add(fruit);
    }
}
