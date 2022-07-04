package com.gmail.aleksandrphilimonov.nested_classes.static_nested_class;

import org.w3c.dom.ls.LSOutput;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int counter;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfEngine);
//        System.out.println(Engine.horsePower);
        Engine engine1 = new Engine(120);
        System.out.println(engine1.horsePower);
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        static int countOfEngine;
        int horsePower;

        public Engine(int horsePower) {
            countOfEngine++;
            this.horsePower = horsePower;
            System.out.println(counter);
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "power=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}
