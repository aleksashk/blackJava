package com.gmail.aleksandrphilimonov.stream;

import java.util.Arrays;

public class StreamExampleChaining {
    public static void main(String[] args) {
        int[] array = {2, -8, 9, 0, -6, 1, 7, 5, -22, 11};
        int result = Arrays.stream(array)
                .filter(value -> value % 2 == 1)
                .map(value -> {
                    if (value % 3 == 0) {
                        value /= 3;
                    }
                    return value;
                })
                .reduce((ac, val) -> ac += val)
                .getAsInt();
        System.out.println(result);
    }
}
