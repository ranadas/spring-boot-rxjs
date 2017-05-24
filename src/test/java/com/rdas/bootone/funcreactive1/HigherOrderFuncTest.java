package com.rdas.bootone.funcreactive1;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * a function that takes one or more functions as arguments and returns a function as result.
 * Created by x148128 on 24/05/2017.
 */
public class HigherOrderFuncTest {

    @Test
    public void TestHigherOrderFunc() {
        Supplier<String> xformOp = createCombinedAndTransform("Rana", "Das", (str) -> str.toUpperCase());
        // execute the HO Func now.
        System.out.println(xformOp.get());
    }

    private Supplier<String> createCombinedAndTransform(final String a, final String b,
                                                        final Function<String, String> transformer) {
        return () -> {
            return transformer.apply(a) + " " + transformer.apply(b);
        };
    }
}
