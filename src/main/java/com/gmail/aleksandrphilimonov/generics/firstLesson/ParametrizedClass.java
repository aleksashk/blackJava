package com.gmail.aleksandrphilimonov.generics.firstLesson;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> infoString = new Info<>("privet");
        System.out.println(infoString);
        String valueS = infoString.getValue();
        System.out.println(valueS);
        Info<Integer> infoInteger = new Info<>(22);
        System.out.println(infoInteger);
        Integer valueI = infoInteger.getValue();
        System.out.println(valueI);
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info:\n\t{" +
                "value = " + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
