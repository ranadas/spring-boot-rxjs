package com.rdas.bootone.asynceg;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by x148128 on 23/05/2017.
 */
public class CompletableFutureExampleOne {

    @Test
    public void testThenApplyFuture() {
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 50, 60);
        integerList.stream()
                .map(data -> CompletableFuture.supplyAsync(() -> getNumber(data)))
                .map(compFuture -> compFuture.thenApply(n -> n * n))
                .map(t -> t.join())
                .forEach(s -> System.out.println(s));
    }


    private int getNumber(int a) {
        return a * a;
    }

    public interface SquareFunction {
        public int sq(int num);
    }

    @Test
    public void testThenAcceptFuture() {
        List<Integer> list = Arrays.asList(10,20,30,40);
        list.stream().map(data->CompletableFuture.supplyAsync(()->"Processing:"+data)).
                map(compFuture->compFuture.thenAccept(s->System.out.println(s))).map(t->t.join())
                .count();
    }
}
