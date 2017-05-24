package com.rdas.bootone.funcreactive1;

import org.junit.Test;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by x148128 on 24/05/2017.
 */
public class FunctionAsParameterTest {

    private BiFunction<String, String, String> concatFunction = (s, t) -> s + t;

    Function<String, String> stringTransformLower = (s) -> s.toUpperCase();

    @Test
    public void testBi() {
        //1.
        //2.
        System.out.println(concatAndTransform("Hello ", "World", Optional.of(stringTransformLower)));
    }


    private String concatAndTransform(String a, String b, Optional<Function<String, String>> functionOptional) {
        if (functionOptional.isPresent()) {
            return functionOptional.get().apply(a) + functionOptional.get().apply(b);
        } else {
            return "";
        }
    }
}
