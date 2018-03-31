package com.bvan.oop.lessons7_8.generic.box.good;

import com.bvan.oop.lessons5_6.format.oop.JsonFormatter;
import com.bvan.oop.lessons7_8.generic.box.Cat;
import com.bvan.oop.lessons7_8.generic.box.Dog;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<String> nameBox = new Box<>("Taras");

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = (Cat)catBox.get();
        cat.meow();
    }
}
