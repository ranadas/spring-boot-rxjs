package com.rdas.bootone.service;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by x148128 on 23/05/2017.
 */
@Service
public class AsyncService {

    @PostConstruct
    public void init() {
        System.out.println("\n\n*** Async Service PC.\n\n");
    }
}
