package com.gmail.aleksandrphilimonov.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void changeAuto(Auto auto, Consumer<Auto> consumer) {
        consumer.accept(auto);
    }

    public static ArrayList<Auto> createThreeAuto(Supplier<Auto> autoSupplier) {
        ArrayList<Auto> autos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            autos.add(autoSupplier.get());
        }
        return autos;
    }

    public static void main(String[] args) {
        ArrayList<Auto> ourAutos = createThreeAuto(() -> new Auto("Nissan Tiida", "Silver Metalic", 1.6));
        System.out.println("ourCars: " + ourAutos);

        changeAuto(ourAutos.get(0), auto -> {
            auto.color = "red";
            auto.engine = 2.4;
            System.out.println("upgraded car: " + auto);
        });

        System.out.println(ourAutos);
    }
}

class Auto {
    String model;
    String color;
    double engine;

    public Auto(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}