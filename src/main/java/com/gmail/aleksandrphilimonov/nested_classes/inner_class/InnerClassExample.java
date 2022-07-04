package com.gmail.aleksandrphilimonov.nested_classes.inner_class;

public class InnerClassExample {
    public static void main(String[] args) {
//        Car car = new Car("Black", 4, 300);
//        System.out.println(car);

        Car car = new Car("Red", 2);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
    }
}

class Car {
    String color;
    static int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "power=" + horsePower +
                    '}';
        }
    }
}
