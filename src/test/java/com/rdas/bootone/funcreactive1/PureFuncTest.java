package com.rdas.bootone.funcreactive1;

import org.junit.Test;

import java.util.stream.IntStream;

/**
 * Created by x148128 on 24/05/2017.
 */
public class PureFuncTest {

    private int state = 1;

    // a pure function : no sideeffects based on class or instance state, time related
    public int f1(int x) {
        return x * 2;
    }

    public int f2(int x) {
        state = (++state % 3);
        return x * 2 + state;
    }

    @Test
    public void TestThis() {
        IntStream.range(0, 100).forEach(it -> {
            //System.out.println("" + it);
            if (f1(5) != 10) {
                throw new IllegalStateException();
            }
        });

        System.out.println("");

        IntStream.range(0, 100).forEach(it -> {
            System.out.println("" + f2(5));

        });
    }
}
