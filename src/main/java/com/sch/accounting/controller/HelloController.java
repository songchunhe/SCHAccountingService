package com.sch.accounting.controller;

import com.sch.accounting.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: SCHAccountingService
 * @description:
 * @author: Schwinn
 * @create: 2022-02-28 20:05
 **/
@RestController
public class HelloController {

    private AtomicLong counter = new AtomicLong();

    @GetMapping(path="v1/greeting")
    public Greeting sayHello(@RequestParam("name") String name)
    {
        return new Greeting(counter.incrementAndGet() ,String.format("fucker,%s",name) );
    }
}


