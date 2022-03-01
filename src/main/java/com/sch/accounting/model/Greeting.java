package com.sch.accounting.model;

/**
 * @program: SCHAccountingService
 * @description:
 * @author: Schwinn
 * @create: 2022-03-01 17:02
 **/
public class Greeting {
    private String name;

    @Override
    public String toString() {
        return "Greeting{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

    public Greeting(Long id,String name) {
        this.name = name;
        this.id = id;
    }
}


