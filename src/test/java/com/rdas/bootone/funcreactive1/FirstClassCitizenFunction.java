package com.rdas.bootone.funcreactive1;

import org.junit.Test;

import java.util.function.BiFunction;

/**
 * Created by x148128 on 24/05/2017.
 */
public class FirstClassCitizenFunction {

    private BiFunction<String, String, String> concatFunction = (s, t) -> s + t;

    @Test
    public void testBi() {
        System.out.println(concatFunction.apply("Hello ", " World"));
    }

    @Test
    public void usingMethodReference() {
        UtilityClass utilityClass = new UtilityClass();
        // Method Reference
        BiFunction<String, String, String> concatStrFunc = utilityClass::concatString;

        System.out.println(concatStrFunc.apply("Rana ", "Das"));
    }


    class UtilityClass {
        public String concatString(String s, String s2) {
            return s+ s2;
        }
    }
}
